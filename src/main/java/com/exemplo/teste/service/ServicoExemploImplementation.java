package com.exemplo.teste.service;

import org.springframework.stereotype.Service;

@Service
public class ServicoExemploImplementation implements ServicoExemplo {

	public String retornaOk() {
		return "Ok!";
	}

	public boolean validaEntrada(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
