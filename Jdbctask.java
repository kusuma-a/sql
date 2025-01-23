
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Jdbctask {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company"; 
        String username = "root";
        String password = "priya1221"; 

        
        String insertQuery = "INSERT INTO employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";


        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

    
            Object[][] employeeData = {
                    {101, "Jenny", 25, 10000},
                    {102, "Jacky", 30, 20000},
                    {103, "Joe", 20, 40000},
                    {104, "John", 40, 80000},
                    {105, "Shameer", 25, 90000}
            };

            for (Object[] emp : employeeData) {
                preparedStatement.setInt(1, (int) emp[0]); 
                preparedStatement.setString(2, (String) emp[1]); 
                preparedStatement.setInt(3, (int) emp[2]); 
                preparedStatement.setDouble(4, (double) emp[3]); 

                preparedStatement.executeUpdate(); 
            }
            System.out.println("Data inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
