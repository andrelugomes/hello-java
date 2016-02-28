package br.com.alura;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by agomes on 28/02/16.
 */
public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("alura","casa do codigo", "caelun");

// forma classica comaprando por A a Z
//        Collections.sort(palavras);


        //Java antes do 8
        //Comparator<String> comparador = new ComparadorPorTamanho();
        //Collections.sort(palavras,comparador);


        //Java 8
        palavras.sort(new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                    return -1;
                if (o1.length() > o2.length())
                    return 1;
                return 0;
            }
        });

        palavras.sort((o1, o2) -> {
                    if (o1.length() < o2.length())
                        return -1;
                    if (o1.length() > o2.length())
                        return 1;
                    return 0;
                }
        );

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //Interface funcional (Comparator) com metodo estático que recebe um Factory com lambdas
        palavras.sort(Comparator.comparing(s -> s.length()));

        //Classico
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator<String> comparing = Comparator.comparing(function);
        palavras.sort(comparing);


        //Referencia de mátodo não é reflection. Será avaliado como um lambd
        //Data uma classe, invoque um único metodo dela
        Function<String, Integer> function2 = String::length;
        palavras.sort(Comparator.comparing(function2));
        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(palavras);

//        Consumer é uma Interface FUNCIONAL
//        Consumer<String> consumidor = new ImprimeNaLinha();
//        palavras.forEach(consumidor);

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        palavras.forEach((String s) ->{
                    System.out.println(s);
                }
        );
//        Sem () pois é um unico argumento
//        sem {} pois tem um unico comando
//        sem ; pois tem uma unica linha
        palavras.forEach(s -> System.out.println(s));

//        Equiparado ao de cima. So serve para interfaces funcionais
        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);

        palavras.forEach(System.out::println);
    }
}
//Consumer é a interface para o forEach
class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length())
            return -1;
        if (o1.length() > o2.length())
            return 1;
        return 0;
    }
}