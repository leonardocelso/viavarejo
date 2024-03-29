package br.com.viavarejo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ParcelaDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2510340217108708555L;

    private Integer numeroParcela;
    private BigDecimal valor;
    private BigDecimal taxaJurosAoMes;

    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getTaxaJurosAoMes() {
        return taxaJurosAoMes;
    }

    public void setTaxaJurosAoMes(BigDecimal taxaJurosAoMes) {
        this.taxaJurosAoMes = taxaJurosAoMes;
    }
}
