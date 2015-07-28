# Lambdas do Java 8
## Estudando os lambdas do Java 8
Estudos baseados na video aluda da AlgaWorks : [AlgaWorks](http://blog.algaworks.com/introducao-ao-lambda-do-java-8/)
Blog da Caelum : [Blog da Caelum](http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/)

### ConteÃºdo

- [ x ] Datas : LocalDate - java.time.LocalDate
     - [ x ] FormataÃ§Ã£o de datas : DateTimeFormatter -  java.time.format.DateTimeFormatter
- [ x ] Interface com mÃ©todo concreto. Modificador de acesso default: 
     - [ x ] Ex.: Iterable.java  - forEach()
     - [ x ] Ex.: java.util.List - sort() - ordenação
     - [   ] @FunctionalInterface - "Criar minha própria" 
- [  ] Lambda Expression : 
     - [ x ] f -> System.out.printf("f.getEmailDevedor()")
     - [ x ] method reference : String s -> s.length() = String::length
- [  ] Streams