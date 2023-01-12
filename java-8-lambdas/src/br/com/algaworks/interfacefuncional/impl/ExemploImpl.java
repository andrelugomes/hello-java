package br.com.algaworks.interfacefuncional.impl;

import br.com.algaworks.interfacefuncional.SimpleFunctionalInterface;


public class ExemploImpl implements SimpleFunctionalInterface {

	@Override
	public void syso(String text) {
		System.out.println(text);
	}

}
