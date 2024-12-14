package org.example.luuanh2;

import java.sql.Connection;
import java.sql.SQLException;

import static org.example.luuanh2.JDBCUtil.print;

public class testJDBC {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection);
        System.out.println();
        print(connection);
        JDBCUtil.closeConnection(connection);

        
    }
}
