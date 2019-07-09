package br.com.viavarejo.service;

import java.util.List;

import br.com.viavarejo.dto.NegociacaoDto;
import br.com.viavarejo.dto.ParcelaDto;

public interface NegociacaoService {

    List<ParcelaDto> comprar(NegociacaoDto negociacao);
    
}
