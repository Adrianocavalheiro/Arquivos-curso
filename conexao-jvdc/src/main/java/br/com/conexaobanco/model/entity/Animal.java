package br.com.conexaobanco.model.entity;

public class Animal implements IAnimal {

    // propriedades ou atributos
    private String nome;
    private String especie;
    protected int idadeEmMeses;
    protected String sexo;
    protected boolean isVivo;

    public Animal() {
        this.isVivo = true;
    }

    public Animal(String nome, String especie, int idadeEmMeses, String sexo) {
        this.nome = nome;
        this.especie = especie;
        this.idadeEmMeses = idadeEmMeses;
        this.sexo = sexo;
        this.isVivo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdadeEmMeses() {
        return idadeEmMeses;
    }

    public void setIdadeEmMeses(int idadeEmMeses) {
        this.idadeEmMeses = idadeEmMeses;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idadeEmMeses +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public void som() {

    }

    @Override
    public boolean isAdulto() {
        return false;
    }

    @Override
    public void dormir() {
        System.out.println("ZZZzzzzZZzZz");
    }

    @Override
    public void morrer() {
        this.isVivo = false;
    }
}