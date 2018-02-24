/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.TestConnection;

import com.ruhul.connection.ConnectionJDBC;

/**
 *
 * @author Ruhul-Pc
 */ 
public class TestConnection {
    public static void main(String[] args) {
        ConnectionJDBC connectionJDBC = new ConnectionJDBC();
        System.out.println(connectionJDBC.getConnection());
    }
}
