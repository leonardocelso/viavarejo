package br.com.viavarejo.repository;

import org.springframework.stereotype.Repository;

import br.com.viavarejo.model.Negociacao;

@Repository
public class NegociacaoRepository {

    public Negociacao salvar(Negociacao negociacao) {
        // Persiste o dado no banco!
        return negociacao;
    }
    
}
