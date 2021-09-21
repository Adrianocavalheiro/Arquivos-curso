package br.com.conexaobanco.model.entity;

public class Pessoa {

    private String name;
    private int idade;
    protected Double cpf;
    protected String endereco;

    public Pessoa() {
    }

    public Pessoa(String name, int idade, Double cpf, String endereco) {
        this.name = name;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}