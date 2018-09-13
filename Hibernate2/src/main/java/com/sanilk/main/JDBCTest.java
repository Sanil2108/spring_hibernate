package com.sanilk.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
    final static String URL = "jdbc:mysql://localhost:3306/hibernate2?useSSL=false&serverTimezone=UTC";
    final static String user = "root";
    final static String pass = "root";

    public static void main(String[] args) throws Exception{
        Connection connection = DriverManager.getConnection(URL, user, pass);
        System.out.println("Connection successful");
    }
}
