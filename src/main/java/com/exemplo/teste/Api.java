package com.exemplo.teste;

import java.util.HashMap;

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
	public ResponseEntity<HashMap<String,String>> retornarOk() {
		HashMap<String, String> map = new HashMap<>();
		map.put("retorno", servicoExemplo.retornaOk());
		//teste
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@PostMapping("/validaEntrada")
	public ResponseEntity<HashMap<String, String>> validaEntrada(int numero) {
		boolean validacao = servicoExemplo.validaEntrada(numero);
		HashMap<String, String> map = new HashMap<>();
		if (validacao) {
			map.put("retorno", "Válido");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("retorno", "Inválido");
			return new ResponseEntity<>(map, HttpStatus.NOT_ACCEPTABLE);
		}
		
		
	}

}
