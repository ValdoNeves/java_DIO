package com.orgfree.valdoneves.jpa_e_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) {

//        String urlConnection = "jdbc:postgresql://localhost:5432/financas";
        String urlConnection = "jdbc:postgresql://127.0.0.1:5432/digital_innovation_one";
        try (Connection conn = DriverManager.getConnection(urlConnection,"postgres","val123");){

            System.out.println("Sucesso!");

            System.out.println(conn.getSchema());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.println("Falha!");
        }

    }

}
