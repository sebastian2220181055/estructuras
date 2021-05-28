package mvc.server.dataBaseConnection;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DataSource  {

    private static DataSource dataSource = null;
    private Connection con;

    private DataSource() {
        Properties conProperties = new Properties();

        try {
            conProperties.load(new FileInputStream("src/mvc/server/data/connection.properties"));

            String url = conProperties.getProperty("url");
            String user = conProperties.getProperty("user");
            String password = conProperties.getProperty("password");

            con = DriverManager.getConnection(url.trim(), user.trim(), password.trim());

            System.out.println("Successful connection");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getInstance(){
        if (dataSource == null){
            dataSource = new DataSource();
        }
        return dataSource;
    }
    public ResultSet runQuery(String sql){
        ResultSet resultSet = null;
        try {
            Statement statement = con.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println("Successful query: "+sql);
        } catch (SQLException e) {
            System.out.println("Query error: "+e.getMessage());
        }
        return resultSet;
    }

    public int runUpdateQuery(String sql){
        int rows=0;
        try {
            Statement statement = con.createStatement();
            rows = statement.executeUpdate(sql);
            System.out.println("Successful query: "+sql);

        } catch (SQLException e) {
            System.out.println("Query error: " + e.getMessage());

        }
        return rows;

    }

}

