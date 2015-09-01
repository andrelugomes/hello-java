package com.andreluisgomes.email;

/**
 * Created by agomes on 27/07/15.
 */
public class EnviadorEmail {

    public void enviar(String to, String texto){
        System.out.printf("Enviando email para : %s | Texto : %s \n", to, texto);
    }
}
