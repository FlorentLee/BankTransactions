package com.yimin.bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class projectAdd {
    static final String DB_URL = "jdbc:redshift://database-bank.cftlrisfj7mu.us-west-2.rds.amazonaws.com:3306/database-bank";
    static final String USER = "admin";
    static final String PASS = "password";

    public static void main(String[] args) {
        System.out.println("Connecting to a selected database...");
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            System.out.println("Connected database successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}