package br.com.algaworks.exemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;

import br.com.algaworks.modelo.Fatura;
import br.com.algaworks.dao.FaturaDAO;
import br.com.algaworks.modelo.Jedi;

/**
 * Created by agomes on 27/07/15.
 * 
 * -
 */
public class ExemploMethodReference {

	public static void main(String[] args) {

		List<Fatura> faturasVencidas = new FaturaDAO().buscarfaturasVencidas();

		/***
		 * devemos utilizá-lo quando precisamos aplicar transformações em nossa
		 * lista sem a necessidade de variáveis intermediárias
		 * 
		 * .average() devolve um Optional
		 */
		OptionalDouble media = faturasVencidas.stream()
				.mapToDouble(Fatura::getValor).average();
		System.out.println(media);

		// Ordenando por string compareToIgnoreCase
		List<String> strArray = Arrays.asList("abe", "adb", "deb", "abc",
				"ghi", "acd", "acg", "acb");
		strArray.sort(String::compareToIgnoreCase);
		strArray.forEach(s -> System.out.println(s));

		List<Jedi> jedi = Arrays.asList(new Jedi("Obi-wan", 80),
				new Jedi("Anakin", 25), new Jedi("Yoda", 500));
		List<String> names = map(Jedi::getName, jedi);
		
		names.forEach(name-> System.out.println(name));

	}
	
	 static <T,R> List<R> map(Function<T,R> function, List<T> source) {
	        List<R> destiny = new ArrayList<>();
	        for (T item : source) {
	            R value = function.apply(item);
	            destiny.add(value);
	        }
	        return destiny;
	    }
}
