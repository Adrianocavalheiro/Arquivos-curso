package br.com.conexaobanco.model.entity;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nome, int idade, String sexo) {
        super(nome, "Gato", idade, sexo);
    }



    @Override
    public void som() {
        System.out.println("Miando");
    }

    @Override
    public void morrer() {
        System.out.println("Morrendo");
        this.isVivo = false;
    }
}
