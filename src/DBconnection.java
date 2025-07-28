import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnection {
    private static final String url="jdbc:mysql://localhost:3306/bug_tracking";
    private static final String username="root";
    private static final String password="Neerajameh12*";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,username,password);
            System.out.println("Connection successfull");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
