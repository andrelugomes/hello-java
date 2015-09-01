package com.andreluisgomes.exemplo;

import com.andreluisgomes.dao.FaturaDAO;
import com.andreluisgomes.email.EnviadorEmail;
import com.andreluisgomes.modelo.Fatura;

import java.util.List;

/**
 * Created by agomes on 27/07/15.
 */
public class Exemplo {

    public static void main(String[] args){
        EnviadorEmail enviador = new EnviadorEmail();

        List<Fatura> faturasVencidas = new FaturaDAO().buscarfaturasVencidas();

       /* for (Fatura f : faturasVencidas) {
            enviador.enviar(f.getEmailDevedor(),f.resumo());
        }*/

        //Sem {} por ser apenas uma linha de código
        //faturasVencidas.forEach((Fatura f) -> enviador.enviar(f.getEmailDevedor(),f.resumo()));

        //Passando a Tipagem = Fatura
        /*faturasVencidas.forEach((Fatura f) -> {
            enviador.enviar(f.getEmailDevedor(),f.resumo());
            //outras linhas executadas
        });*/

        //Sem a Tipagem, pois ja sabe-se que a lista é de faturas
        /*faturasVencidas.forEach(f -> {
            enviador.enviar(f.getEmailDevedor(),f.resumo());
        });*/


        faturasVencidas.forEach(f -> enviador.enviar(f.getEmailDevedor(),f.resumo()));
    }
}
