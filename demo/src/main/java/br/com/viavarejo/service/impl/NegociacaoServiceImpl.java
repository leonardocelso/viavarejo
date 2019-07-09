package br.com.viavarejo.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.viavarejo.converter.NegociacaoConverter;
import br.com.viavarejo.dto.NegociacaoDto;
import br.com.viavarejo.dto.ParcelaDto;
import br.com.viavarejo.exception.ValidacaoException;
import br.com.viavarejo.model.CondicaoPagamento;
import br.com.viavarejo.model.Negociacao;
import br.com.viavarejo.model.Produto;
import br.com.viavarejo.repository.NegociacaoRepository;
import br.com.viavarejo.service.NegociacaoService;

@Service
public class NegociacaoServiceImpl implements NegociacaoService {

    private static final BigDecimal TAXA_JUROS = new BigDecimal("1.15");
    private static final Integer PARCELA_COM_JUROS = 6;
    
    @Autowired
    private NegociacaoRepository repository;

    @Override
    public List<ParcelaDto> comprar(NegociacaoDto negociacaoDto) {

        validar(negociacaoDto);

        final Negociacao negociacao = NegociacaoConverter.toEntity(negociacaoDto);
        final Produto produto = negociacao.getProduto();
        final CondicaoPagamento condicaoPagamento = negociacao.getCondicaoPagamento();
        
        repository.salvar(negociacao);

        List<ParcelaDto> parcelas = new ArrayList<>();
        BigDecimal juros = condicaoPagamento.getQtdeParcelas() > PARCELA_COM_JUROS ? TAXA_JUROS : BigDecimal.ZERO;
        BigDecimal valorDescontaEntrada = produto.getValor().subtract(condicaoPagamento.getValorEntrada());
        BigDecimal valorParcela = valorDescontaEntrada.divide(BigDecimal.valueOf(condicaoPagamento.getQtdeParcelas()), 2, RoundingMode.HALF_UP);

        for (int i = 1; i <= condicaoPagamento.getQtdeParcelas(); i++) {
            ParcelaDto parcela = new ParcelaDto();
            parcela.setNumeroParcela(i);
            parcela.setTaxaJurosAoMes(juros);
            parcela.setValor(juros.equals(BigDecimal.ZERO) ? valorParcela : valorParcela.multiply(juros));
            parcelas.add(parcela);
        }

        return parcelas;
    }

    private void validar(NegociacaoDto negociacaoDto) {
        
        if (negociacaoDto.getCondicaoPagamento() == null) {
            throw new ValidacaoException("Condição de Pagamento obrigatório!");
        }
        
        if (negociacaoDto.getProduto() == null) {
            throw new ValidacaoException("Produto obrigatório!");
        }
        
        if (negociacaoDto.getCondicaoPagamento().getQtdeParcelas() == null || negociacaoDto.getCondicaoPagamento().getQtdeParcelas() <= 0) {
            throw new ValidacaoException("Quantidade de parcelas obrigatório!");
        }
        
        if (negociacaoDto.getProduto().getCodigo() == null || negociacaoDto.getProduto().getCodigo() <= 0) {
            throw new ValidacaoException("Código do produto obrigatório!");
        }
        
        if (negociacaoDto.getProduto().getValor() == null || negociacaoDto.getProduto().getValor().equals(BigDecimal.ZERO)) {
            throw new ValidacaoException("Valor do produto obrigatório!");
        }
    }
}
