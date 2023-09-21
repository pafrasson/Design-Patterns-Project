package test;

import dominio.Pessoa;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        new Pessoa.PersonBuilder().firstname("Pedro").lastName("Finch").email("testemail@gmail.com");
    }
}