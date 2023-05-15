//package dao;
//
//import com.mysql.cj.jdbc.Driver;
//import model.Author;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//public class AuthorsDao implements Authors {
//    private Connection connection;
//
//    public AuthorsDao (){
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root",
//                    "codeup");
//        } catch (SQLException sqlx) {
//            throw new RuntimeException("Error connecting to the database!", sqlx);
//
//        }
//
//    }
//    @Override
//    public List<Author> all() {
//        List<Authors>authors = new ArrayList<>();
//    }
//        try {
//            Statement statement = connection.createStatement();
//            // Execute Statement
//            ResultSet resultSet = statement.executeQuery("SELECT *  FROM bigfoot_test_db.authors");
//            // Iterate over results
//            while (resultSet.next()) {
//                Author author = new Author();
//                author.setId(resultSet.getLong("id"));
//                authors.add(resultSet.getString("name"));
//                    resultSet.getLong("id"),
//                    resultSet.getString("name")
//                            );
//                authors.add(author);
//
//            } catch (SQLException sqlx) {
//                throw new RuntimeException("Error connecting to DB.", sqlx);
//        }
//
//    }
//
//    @Override
//    public void insert(Author author) {
//
//    }
//}
