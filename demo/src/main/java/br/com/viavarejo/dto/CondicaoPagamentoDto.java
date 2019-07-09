package br.com.viavarejo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CondicaoPagamentoDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4663839706293219923L;

    private BigDecimal valorEntrada;
    private Integer qtdeParcelas;

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
