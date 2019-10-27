/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carli
 */
public class ConnectionPostgreSQL {
    private static ConnectionPostgreSQL instance;
    private static Connection connection;

    private static final String serverName = "localhost";
    private static final String mydatabase = "cpa";
    private static final String userName = "projeto";
    private static final String password = "projeto";

    private static String url = "jdbc:postgresql://" + serverName + "/" + mydatabase
                                + "?useTimezone=true&serverTimezone=UTC";

    private ConnectionPostgreSQL() {
        try {
            ConnectionPostgreSQL.connection = (Connection) DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            System.out.println("Conexao nao criada." + e.getMessage());
        }
    }

    public static ConnectionPostgreSQL getInstance() {
        if (instance == null) instance = new ConnectionPostgreSQL();
        return instance;
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
