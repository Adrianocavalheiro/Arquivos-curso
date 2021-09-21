package br.com.conexaobanco;

import br.com.conexaobanco.model.dao.AnimalDAO;
import br.com.conexaobanco.model.entity.Animal;
import br.com.conexaobanco.model.entity.Cachorro;
import br.com.conexaobanco.model.entity.Gato;
import br.com.conexaobanco.model.entity.Girafa;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class TestePrincipal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Animal c = new Gato("Jojo", 12, "femea");
        System.out.println(c);
        c.som();
        c.morrer();
        c.dormir();
        /*AnimalDAO dao = new AnimalDAO();
        dao.save(c);*/

        Animal gg = new Girafa("Joana", 24, "Femea");
        System.out.println(gg);
        gg.som();
        c.dormir();
        /*AnimalDAO dao1 = new AnimalDAO();
        dao1.save(gg);*/

        Animal cc = new Cachorro("Supino", 36, "Macho");
        System.out.println(cc);
        cc.som();
        c.dormir();
        /*AnimalDAO dao2 = new AnimalDAO();
        dao2.save(cc);*/

    }
}