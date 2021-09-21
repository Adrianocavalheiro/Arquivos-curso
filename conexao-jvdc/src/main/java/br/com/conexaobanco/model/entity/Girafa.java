package br.com.conexaobanco.model.entity;

public class Girafa extends Animal{

    public Girafa() {
    }

    public Girafa(String nome, int idade, String sexo) {
        super(nome, "Girafa", idade, sexo);
    }

    @Override
    public void som() {
        System.out.println("Chorando");
    }
}
