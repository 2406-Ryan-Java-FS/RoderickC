package Util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtil {

    private static Connection conn = null;

    public static Connection getConnection() {

        if (conn == null) {
            //Establish a new Connection

            try {
                FileInputStream input = new FileInputStream(ConnectionUtil.class.getClassLoader().getResource("connection.properties").getFile());

                Properties props = new Properties();
                props.load(input);

                String endpoint = props.getProperty("ENDPOINT");
                String database = props.getProperty("DATABASE");
                String url = "jdbc:postgresql://" + endpoint + "/" + database;
                String username = props.getProperty("USERNAME");
                String password = props.getProperty("PASSWORD");


                conn = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return conn;

    }

    //This is for testing purposes only. Not needed to actually use JDBC.
    public static void main(String[] args) {

        Connection conn1 = getConnection();
        Connection conn2 = getConnection();

        System.out.println(conn1);
        System.out.println(conn2);

    }

}