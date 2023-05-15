import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;

public class DatabaseCreator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/adlister_db";
        String username = "root";
        String password = "codeup";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            try (Statement statement = connection.createStatement()) {
                // Create the users table
                String createUsersTable = "CREATE TABLE users (" +
                        "id INT PRIMARY KEY AUTO_INCREMENT," +
                        "username VARCHAR(50) NOT NULL," +
                        "email VARCHAR(100) NOT NULL," +
                        "password VARCHAR(255) NOT NULL" +
                        ")";

                // Create the ads table
                String createAdsTable = "CREATE TABLE ads (" +
                        "id INT PRIMARY KEY AUTO_INCREMENT," +
                        "user_id INT NOT NULL," +
                        "title VARCHAR(100) NOT NULL," +
                        "description TEXT," +
                        "FOREIGN KEY (user_id) REFERENCES users(id)" +
                        ")";

                // Execute the SQL statements to create the tables
                statement.executeUpdate(createUsersTable);
                statement.executeUpdate(createAdsTable);

                System.out.println("Tables created successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
