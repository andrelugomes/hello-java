package com.andreluisgomes.exemplo;

import com.andreluisgomes.interfacefuncional.SimpleFunctionalInterface;
import com.andreluisgomes.interfacefuncional.impl.ExemploImpl;

/**
 * Created by agomes on 27/07/15.
 * 
 * - Utilizando método herdado de interface com modificador default
 * - Atribuindo o compotamento do metoto abstrado com o lambida
 */
public class ExemploInterfaceFuncional {

    public static void main(String[] args){
        
        ExemploImpl exemploImpl = new ExemploImpl();
        
        exemploImpl.syso("Imprimindo pelo método sobrescrito");
        exemploImpl.puts("Imprimindo pelo método herdado");
        
        SimpleFunctionalInterface anonimo = new SimpleFunctionalInterface() {
			
			@Override
			public void syso(String text) {
				System.out.println(text);
			}
		};
		anonimo.syso("Syso com classe anônima");
		anonimo.puts("Puts com classe anônima (HERDADO)");
        
        SimpleFunctionalInterface interfaceFunciona = (s) -> {
        	//Atribuindo o compotamento de syso()
        	System.out.println(s);
        	
        };
        interfaceFunciona.puts("Puts com lambida (HERDADO)");
        interfaceFunciona.syso("String para a variavel s do lambida");
        
    }    
}
