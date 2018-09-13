package com.sanilk.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

    public static void main(String[] args){

        String jdbcURL = "jdbc:mysql://localhost:3306/hibernate1?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        try{
//            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to the database ...");
            Connection connection = DriverManager.getConnection(jdbcURL, user, pass);
            System.out.println("Connection successful ...");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
