/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruhul-Pc
 */
public class ConnectionJDBC {
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNMAE = "struts_jdbc_crud";
    private static final String URL = HOST + "/" + DBNMAE;
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(URL, "root", "root");
            System.out.println("::Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}
