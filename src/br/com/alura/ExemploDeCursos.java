package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by agomes on 28/02/16.
 */
public class ExemploDeCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("java", 12));
        cursos.add(new Curso("python", 1));
        cursos.add(new Curso("JavaScript",44));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
//        cursos.forEach(c -> System.out.println(c.getNome()));

        //Um Stream não impacta na Colection original... trata-se de outro fluxo de dados em memória
        //o Stream foi construido com desing patter : Fluente Interface, Interface fluente e encadeada...
        //Streams trabalham de maneira Lazy, evitam problemas de concorrencias (thread safe)
        //Um Filter recebe um Predicate (condição)

        cursos.stream().filter(c->c.getAlunos() > 10).forEach(c -> System.out.println(c.getNome()));

        int sum = cursos.stream().filter(c -> c.getAlunos() > 10).mapToInt(Curso::getAlunos).sum();
        System.out.println(sum);

        Stream<String> streamDeStrings = cursos.stream().map(Curso::getNome);
    }
}

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}
