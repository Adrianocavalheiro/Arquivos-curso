package br.com.conexaobanco.model.entity;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome, int idade, String sexo) {
        super(nome, "Cachorro", idade, sexo);
    }

    @Override
    public void som() {
        System.out.println("Latindo");
    }

}
