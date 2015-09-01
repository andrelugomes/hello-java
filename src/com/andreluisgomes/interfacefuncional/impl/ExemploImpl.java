package com.andreluisgomes.interfacefuncional.impl;

import com.andreluisgomes.interfacefuncional.SimpleFunctionalInterface;


public class ExemploImpl implements SimpleFunctionalInterface{

	@Override
	public void syso(String text) {
		System.out.println(text);
	}

}
