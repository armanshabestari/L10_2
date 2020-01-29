package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database implements Runnable {
    @Override
    public void run() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager
                    .getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                            "armansh","arman4563");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO entrance" +
                    "(username,password) VALUES (?,?)");
            preparedStatement.setString(1,"arm5adsh@yahoo.com");
            preparedStatement.setString(2,"armn9812");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
