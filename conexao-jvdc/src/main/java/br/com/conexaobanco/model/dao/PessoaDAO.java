package br.com.conexaobanco.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO = DATA OBJECT ACESS
public class PessoaDAO {
    private br.com.conexaobanco.model.data.Conexao conexao = null;

    public PessoaDAO() throws SQLException, ClassNotFoundException {
        this.conexao = new br.com.conexaobanco.model.data.Conexao();
    }

    public void save(br.com.conexaobanco.model.entity.Pessoa pessoa) throws SQLException {
        String statement = "INSERT INTO pessoa(nome, idade, cpf, endereco) values (? , ?, ?, ?)";

        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {

            pstmt.setString(1, pessoa.getName());
            pstmt.setInt(2, pessoa.getIdade());
            pstmt.setDouble(3, pessoa.getCpf());
            pstmt.setString(4, pessoa.getEndereco());

            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
}