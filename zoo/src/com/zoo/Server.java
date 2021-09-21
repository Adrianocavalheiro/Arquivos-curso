package com.zoo;

import com.zoo.entities.Animal;

public class Server {

    public static void main(String[] args) {

        // MESMO RESULTADO QUE O METODO ABAIXO
        Animal animal = new Animal("Supino", "Cachorro vira lata", 8);

        /*animal.setNome("Supino");
        animal.setEspecie("Cachorro vira lata");
        animal.setIdade(8);*/

        animal.emitirSom();

        System.out.println("Olá, seu animal é um " + animal.getEspecie()
                + ", o nome dele é " + animal.getNome() + " e tem " + animal.getIdade() + " ano(s)");

        if (animal.isAdulto()){
            System.out.println("É adulto");
        }else {
            System.out.println("Filhote");
        }
    }
}
