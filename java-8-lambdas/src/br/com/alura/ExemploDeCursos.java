package br.com.alura;

import java.util.*;
import java.util.stream.Collectors;
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

        //Caso for um mapToDouble, DoucleStream : Você também pode representar utilizando um Stream<Double>,
        //mas isso vai forçar o autoboxing dos doubles (para o tipo Double) . Isto é, utilizará mais recursos da JVM.


        Stream<String> streamDeStrings = cursos.stream().map(Curso::getNome);

        //Optional
        Optional<Curso> cursoOptional = cursos.stream().filter(c -> c.getAlunos() > 10).findAny();
        cursoOptional.ifPresent(c -> System.out.println(c.getNome()));


        //Colectors

        List<Curso> novaListaDeCurso = cursos.stream().filter(c -> c.getAlunos() > 10).collect(Collectors.toList());

        novaListaDeCurso.forEach(curso -> System.out.println(curso.getNome()));

        //toMap, recebe duas functions, uma para chave e outra pro valor
        Map<String, Integer> mapDeCursos = cursos.stream()
                .filter(c -> c.getAlunos() > 10)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()));

        System.out.println(mapDeCursos);

        cursos.stream()
                .filter(c -> c.getAlunos() > 10)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, aluno) -> System.out.println(nome + " tem "+ aluno+" alunos"));


        //MEdia de quantidade de alunos
        OptionalDouble average = cursos.stream().mapToDouble(Curso::getAlunos).average();
        System.out.println(average);

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
