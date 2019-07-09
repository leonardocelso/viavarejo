package br.com.viavarejo.converter;

import br.com.viavarejo.dto.NegociacaoDto;
import br.com.viavarejo.model.CondicaoPagamento;
import br.com.viavarejo.model.Negociacao;
import br.com.viavarejo.model.Produto;

public class NegociacaoConverter {

    private NegociacaoConverter() {
        
    }

    public static Negociacao toEntity(NegociacaoDto dto) {
        Negociacao entity = new Negociacao();
        entity.setCondicaoPagamento(new CondicaoPagamento(dto.getCondicaoPagamento()));
        entity.setProduto(new Produto(dto.getProduto()));
        return entity;
    }
}
