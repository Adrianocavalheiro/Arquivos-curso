package br.com.conexaobanco.model;

import br.com.conexaobanco.model.dao.AnimalDAO;
import br.com.conexaobanco.model.entity.Animal;

import java.sql.SQLException;
import java.util.List;

public class Server {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // CLASSE QUE ADICIONA OS ANIMAIS AO BANCO

            /*Animal a = new Animal("Kaka", "Cachorro", 7, "Fêmea");
            AnimalDAO dao = new AnimalDAO();
            dao.save(a);*/

        // LISTAR OS ANIMAIS CADASTRADOS NO BANCO

        // System.out.println(daoLista.findAll());

        // LISTA DE ANIMAIS DO BANCO ORGANIZADA

            /*AnimalDAO daoLista = new AnimalDAO();

            List<Animal> animais = daoLista.findAll();
            for (Animal itemList: animais) {
                System.out.println(itemList);
            }*/

        // COMANDO QUE ALTERA UM DADO INFORMADO NO BANCO
        /*AnimalDAO daoAlteracao = new AnimalDAO();
        daoAlteracao.update("Kaka", 3);

        // listar as informacoes do banco
        AnimalDAO novaLista = new AnimalDAO();,


        List<Animal> animaisEditados = novaLista.findAll();
        for (Animal itemList: animaisEditados) {
            System.out.println(itemList);
        }*/

        // COMANDO PARA DELETAR UM ARQUIVO DO BANCO
        AnimalDAO daoDelete = new AnimalDAO();
        daoDelete.delete(3);

        AnimalDAO novaLista = new AnimalDAO();

        List<Animal> listaDeletado = novaLista.findAll();
        for (Animal itemList : listaDeletado) {
            System.out.println(itemList);
        }

    }
}