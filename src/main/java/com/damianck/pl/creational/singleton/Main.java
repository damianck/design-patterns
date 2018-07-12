package com.damianck.pl.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBSingleton dbSingleton = DBSingleton.getInstance();

        Connection connection = dbSingleton.getConnection();

        System.out.println("dbSingleton instace " + dbSingleton);
        System.out.println("connection instance " + connection);
        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();
        //redundant
        Connection connection1 = dbSingleton.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println("Time " + (timeAfter - timeBefore));

        Statement statement;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
                    + " City VARCHAR(20))");
            System.out.println("Table created.");
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        timeBefore = System.currentTimeMillis();
        connection1 = dbSingleton.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println("Time: " + (timeAfter - timeBefore));


        System.out.println("connection1 instance " + connection1);

        try {
            statement = connection1.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from Address");

            System.out.println(resultSet);
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
