package com.exemplo.teste.service;

import org.springframework.stereotype.Service;

@Service
public class ServicoExemploImplementation implements ServicoExemplo {

	public String retornaOk() {
		return "Ok!";
	}

	public boolean validaEntrada(int numero) {

		return numero % 2 == 0;
	}
}
