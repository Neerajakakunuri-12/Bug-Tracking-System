import java.sql.*;
public class BugReporter {
    private static final String url="jdbc:mysql://localhost:3306/bug_tracking";
    private static final String username="root";
    private static final String password="Neerajameh12*";

    public static void main(String[] args) {
        String title = "Login Button Not Working";
        String description = "Clicking the login button does nothing on Chrome browser.";
        String project_name = "BugTrackerSystem";
        String priority = "High";
        String status = "Open";
        String reporter_name = "Ravi";
        String developer_name = "Rahul";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,username,password);
            String sql="INSERT INTO bug_reports(title,description,project_name,priority,status,reporter_name,developer_name) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);

            preparedStatement.setString(1,title);
            preparedStatement.setString(2,description);
            preparedStatement.setString(3,project_name);
            preparedStatement.setString(4,priority);
            preparedStatement.setString(5,status);
            preparedStatement.setString(6,reporter_name);
            preparedStatement.setString(7,developer_name);

            int rowsAffeccted=preparedStatement.executeUpdate();
            if(rowsAffeccted>0){
                System.out.println("Data inserted successfully");
            }else{
                System.out.println("Failed");
            }
            preparedStatement.close();
            connection.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
