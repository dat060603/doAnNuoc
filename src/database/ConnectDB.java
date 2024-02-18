package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost;database=TinhTienDien;encrypt=true;trustServerCertificate=true;";
            String username = "sa";
            String password = "123456";
            conn = DriverManager.getConnection(connectionURL, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
//    public static void main(String[] args) {
//        Connection conn = ConnectDB.getConnection();
//        System.out.println("Success");
//    }
}
