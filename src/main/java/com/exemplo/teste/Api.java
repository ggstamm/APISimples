package com.exemplo.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemplo.teste.service.ServicoExemplo;

@RestController
@RequestMapping
public class Api {

	@Autowired
	private ServicoExemplo servicoExemplo;

	@PostMapping("/mensagemOk")
	public ResponseEntity<String> retornarOk() {
		return new ResponseEntity<String>(servicoExemplo.retornaOk(), HttpStatus.OK);
	}

	@PostMapping("/validaEntrada")
	public ResponseEntity<String> validaEntrada(int numero) {
		boolean validacao = servicoExemplo.validaEntrada(numero);
		if (validacao) {
			return new ResponseEntity<String>("Válido", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Inválido", HttpStatus.NOT_ACCEPTABLE);
		}
	}

}
