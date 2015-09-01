package com.andreluisgomes.interfacefuncional;


/**
 * 
 * @author agomes
 * 
 * - Interface Funcional leva a anotação @FunctionalInterface (Apenas para verificação de compilação)
 * - Deve conter apenas um método abstrato
 * - usado para Lambda expressions, Method reference e constructor references
 * - pode ter metodos concretos (default)
 *
 */
@FunctionalInterface
public interface SimpleFunctionalInterface {
	public void syso(String text);
	
	default void puts(String text){
		System.out.println(text);
	}
}
