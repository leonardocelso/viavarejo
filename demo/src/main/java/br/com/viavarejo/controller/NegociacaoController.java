package br.com.viavarejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viavarejo.dto.NegociacaoDto;
import br.com.viavarejo.dto.ParcelaDto;
import br.com.viavarejo.service.NegociacaoService;

@RestController
@RequestMapping("/negociacao")
public class NegociacaoController {
    
	@Autowired
	private NegociacaoService negociacaoService;
	
	@PostMapping("/comprar")
	public List<ParcelaDto> comprar(@RequestBody NegociacaoDto negociacao){
	    return negociacaoService.comprar(negociacao);
	}
}