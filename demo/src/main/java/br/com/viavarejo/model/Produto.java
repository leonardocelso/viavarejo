package br.com.viavarejo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.viavarejo.dto.ProdutoDto;

public class Produto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1257337947679535793L;
    
    private Long codigo;
    private String nome;
    private BigDecimal valor;

    public Produto() {
        
    }
    
    public Produto(ProdutoDto produtoDto) {
        this.codigo = produtoDto.getCodigo();
        this.nome = produtoDto.getNome();
        this.valor = produtoDto.getValor();
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}
