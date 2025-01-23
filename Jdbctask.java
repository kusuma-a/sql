
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Jdbctask {

    public static void main(String[] args) {
        // Step 1: Database connection details
        String url = "jdbc:mysql://localhost:3306/company"; // Replace 'company' with your DB name
        String username = "root"; // Replace with your DB username
        String password = ""; // Replace with your DB password

        // Step 2: SQL Insert Query
        String insertQuery = "INSERT INTO employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";


        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            // Correct data type usage
            Object[][] employeeData = {
                    {101, "Jenny", 25, 10000},
                    {102, "Jacky", 30, 20000},
                    {103, "Joe", 20, 40000},
                    {104, "John", 40, 80000},
                    {105, "Shameer", 25, 90000}
            };

            for (Object[] emp : employeeData) {
                preparedStatement.setInt(1, (int) emp[0]); // empcode
                preparedStatement.setString(2, (String) emp[1]); // empname
                preparedStatement.setInt(3, (int) emp[2]); // empage
                preparedStatement.setDouble(4, (double) emp[3]); // esalary

                preparedStatement.executeUpdate(); // Execute the query
            }
            System.out.println("Data inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}