import java.sql.*;

public class demo {
    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "prasanta");

            System.out.println("Connection success");

        } catch (Exception exc) {
            System.out.println("Connection failed");
            System.out.println("Error: "+exc.getLocalizedMessage());
        }
    }
}