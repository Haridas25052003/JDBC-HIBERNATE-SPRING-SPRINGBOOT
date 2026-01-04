package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDao {

    public Connection createConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/d1",
                "root",
                "root123"
            );

            System.out.println("Database connected successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con; 
    }
}
