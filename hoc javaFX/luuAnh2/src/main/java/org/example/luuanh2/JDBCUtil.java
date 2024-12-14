package org.example.luuanh2;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtil {
    public static Connection getConnection() throws SQLException {
        Connection c = null;

        /* đăng kí MySQL Drivew với DriverManager*/
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mySQL://localhost:3307/librarymanagement";
        String username = "root";
        String password = "";

        //tạo kết nôi
        c = DriverManager.getConnection(url, username, password);

        return c;
    }

    public static void closeConnection(Connection c) throws SQLException {
        if (c != null) c.close();
    }

    public static void print(Connection c) throws SQLException {
        if (c != null) {
            System.out.println(c.getMetaData().getDatabaseProductName());
            System.out.println(c.getMetaData().getDatabaseProductVersion());
        }
    }
}
