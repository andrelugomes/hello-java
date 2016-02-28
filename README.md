# Lambdas do Java 8
## Estudando os lambdas do Java 8
Estudos baseados na video aluda da AlgaWorks : [AlgaWorks](http://blog.algaworks.com/introducao-ao-lambda-do-java-8/)

Blog da Caelum : [Blog da Caelum](http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/)

### Conteúdo

- [x] Datas : LocalDate - java.time.LocalDate
     - [x] Formatação de datas : DateTimeFormatter -  java.time.format.DateTimeFormatter
- [x] Interface com método concreto. Modificador de acesso default: 
     - [x] Ex.: Iterable.java  - forEach()
     - [x] Ex.: java.util.List - sort() - ordenação
     - [x] @FunctionalInterface - "Criar minha própria"
        - 1 único método abstrato. Além desse método ela pode ter outros métodos, contanto que sejam default.
        - Essa estrutura é fundamental, pois assim o compilador sabe exatamente que o corpo da expressão lambda que escrevemos é a implementação de seu único método abstrato
     - [x] Testar a "herança" de método concreto default
- [ ] Lambda Expression : 
     - [x] f -> System.out.printf("f.getEmailDevedor()")
     - [x] implementar comportamento com Interface Funcional
     - [ ] method reference : String s -> s.length() = String::length
- [ ] Streams
	 - [x] filter()
	 - [x] map()
	 - [ ] reduce()
	 - [x] collect() - trasnforma o stream em uma collections novamente
	 - [ ] parallel()
- [ ] Optional
