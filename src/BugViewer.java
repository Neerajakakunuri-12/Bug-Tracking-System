import java.sql.*;
public class BugViewer {
    private static final String url="jdbc:mysql://localhost:3306/bug_tracking";
    private static final String username="root";
    private static final String password="Neerajameh12*";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,username,password);

            String sql="SELECT * FROM bug_reports;";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            System.out.println("All bugs Reported:\n");

            while (resultSet.next()){
                int id=resultSet.getInt("bug_id");
                String title=resultSet.getString("title");
                String description=resultSet.getString("description");
                String project = resultSet.getString("project_name");
                String priority = resultSet.getString("priority");
                String status = resultSet.getString("status");
                String reporter = resultSet.getString("reporter_name");
                String developer = resultSet.getString("developer_name");
                Timestamp reportedDate = resultSet.getTimestamp("date_reported");

                System.out.println("Bug ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Description: " + description);
                System.out.println("Project: " + project);
                System.out.println("Priority: " + priority);
                System.out.println("Status: " + status);
                System.out.println("Reporter: " + reporter);
                System.out.println("Developer: " + developer);
                System.out.println("Date Reported: " + reportedDate);
                System.out.println("-----------------------------------");
            }
            resultSet.close();
            statement.close();
            connection.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
