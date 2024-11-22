package org.example;

import java.sql.*;
import java.util.logging.Logger;

public class DatabaseConnection {

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/houseofsounds";
    private String username = "Admino";
    private String password = "Käsekuchen69";
    private String sqlCMD;



    public DatabaseConnection(String eingabe) {
        this.setSqlCMD("SELECT * FROM " + eingabe);
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, getUsername(), getPassword());
            Statement stm = connection.createStatement();
            System.out.println("Verbindung erfolgreich!");

            ResultSet rs = stm.executeQuery(getSqlCMD());
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();


            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-55s", rsmd.getColumnName(i));
            }
            System.out.println();


            for (int i = 1; i <= columnCount; i++) {
                System.out.print("-------------------------------------------------------");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-55s", rs.getString(i));
                }
                System.out.println();
            }

            connection.close();
        } catch (SQLException e) {
            Logger.getGlobal().warning(e.getMessage());
        }
    }



    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/houseofsounds","Admino","Käsekuchen69");
        return connection;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSqlCMD() {
        return sqlCMD;
    }

    public void setSqlCMD(String sqlCMD) {
        this.sqlCMD = sqlCMD;
    }
}
