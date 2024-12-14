import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
//    public static final String url1 = "jdbc:mysql://192.168.50.100:3307/listimageofreader";
    public static final String url1 = "jdbc:mysql://10.20.17.192:3307/listimageofreader";
    public static Connection connection = null;

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        connection = DriverManager.getConnection(url1, "user2", "");
        if (connection == null) {
            System.out.println("son of bitch");
        } else System.out.println("thanh cong");
    }
}