package br.com.viavarejo.dto;

import java.io.Serializable;

public class NegociacaoDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1422922463064713706L;

    private ProdutoDto produto;
    private CondicaoPagamentoDto condicaoPagamento;

    public ProdutoDto getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDto produto) {
        this.produto = produto;
    }

    public CondicaoPagamentoDto getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamentoDto condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

}
