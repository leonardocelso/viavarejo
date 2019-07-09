package br.com.viavarejo.model;

import java.io.Serializable;

public class Negociacao implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6990149474520247984L;
    
    private Produto produto;
    private CondicaoPagamento condicaoPagamento;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

}
