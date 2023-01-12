package br.com.algaworks.exemplo;

import java.util.Comparator;
import java.util.List;

import br.com.algaworks.modelo.Fatura;
import br.com.algaworks.dao.FaturaDAO;
import br.com.algaworks.email.EnviadorEmail;

/**
 * Created by agomes on 27/07/15.
 */
public class ExemploOrdenacao {

    public static void main(String[] args){
        EnviadorEmail enviador = new EnviadorEmail();

        List<Fatura> faturasVencidas = new FaturaDAO().buscarfaturasVencidas();
        
        //antes, no java 7 - Sem Comparator
        //Collections.sort(faturasVencidas);
        
        //antes, no java 7 - Com Comparator
        /*Comparator<Fatura> comparador = new Comparator<Fatura>() {
			@Override
			public int compare(Fatura arg0, Fatura arg1) {
				
				return (int) (arg0.getValor() - arg1.getValor());
			}
    	};*/
        //Collections.sort(faturasVencidas,comparador);
        
        /*Comparator<Fatura> comparador = (s1,s2) -> {
        	return (int) (s1.getValor() - s2.getValor());
        };*/
        //Comparator<Fatura> comparador = (s1,s2) -> (int) (s1.getValor() - s2.getValor());
        
        
        // Agora o Java 8 possui o método sort() na Interface java.util.List
        //faturasVencidas.sort((s1,s2) -> (int) (s1.getValor() - s2.getValor()));
        
        //O Comparator possui o factory method comparing. Ele recebe uma Function e devolve algo que queiramos usar como critério de comparação
        //faturasVencidas.sort(Comparator.comparing(f -> f.getValor()));
        
        //Method Reference
        faturasVencidas.sort(Comparator.comparing(Fatura::getValor));
        
        faturasVencidas.forEach(f -> enviador.enviar(f.getEmailDevedor(),f.resumo()));
    }
}
