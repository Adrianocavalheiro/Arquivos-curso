package br.com.conexaobanco.model;

import br.com.conexaobanco.model.dao.PessoaDAO;
import br.com.conexaobanco.model.entity.Pessoa;

import java.sql.SQLException;

public class Server2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Pessoa a = new Pessoa("Pedro", 28, 000.000000, "rua jose da silva");

        PessoaDAO dao = new PessoaDAO();
        dao.save(a);
    }
}