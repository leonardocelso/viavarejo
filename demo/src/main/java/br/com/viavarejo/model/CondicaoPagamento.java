package br.com.viavarejo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.viavarejo.dto.CondicaoPagamentoDto;

public class CondicaoPagamento implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1443224358053839558L;
    
    private BigDecimal valorEntrada;
    private Integer qtdeParcelas;

    public CondicaoPagamento() {
        
    }
    
    public CondicaoPagamento(CondicaoPagamentoDto condicaoPagamentoDto) {
        this.valorEntrada = condicaoPagamentoDto.getValorEntrada();
        this.qtdeParcelas = condicaoPagamentoDto.getQtdeParcelas();
    }
    
    public BigDecimal getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(BigDecimal valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Integer getQtdeParcelas() {
        return qtdeParcelas;
    }

    public void setQtdeParcelas(Integer qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }
}
