package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
// IMplements Users vs UsersDAo
public class MySQLUsersDao implements UsersDao {
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    @Override
    public Long insert(String username, String email, String password) {
        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
        return null;
    }

    @Override
    public String findUsernameById(long id) {
        // TODO: Implement this method
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Long insert(User user) {
        return null;
    }

    @Override
    public Long findIdByUsername(String username) {
        return null;
    }

    @Override
    public String findEmailByUsername(String username) {
        return null;
    }

    @Override
    public String findPasswordByUsername(String username) {
        return null;
    }
}


//public class MySQLUsersDao implements Users{
//    private Connection connection;
//
//    public MySQLUsersDao(Config config) {
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUsername(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database!", e);
//        }
//    }
//    @Override
//    public Long insert(String username, String email, String password) {
//        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
//            stmt.setString(1, username);
//            stmt.setString(2, email);
//            stmt.setString(3, password);
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            if (rs.next()) {
//                return rs.getLong(1);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating a new user.", e);
//        }
//        return null;
//    }
//
//    @Override
//    public String findUsernameById(String username) {
//      String Query = "SELCT * FROM users WHERE username = ? LIMIT 1";
//      try{
//          PreparedStatement stmt = connection.prepareStatement(query);
//            stmt.setString(1, username);
//            return extractUser(stmt.executeQuery());
//      } catch (SQLException e) {
//          throw new RuntimeException("Error finding a iuser by user",
//
//      }
//
//    }
//
//    @Override
//    public User findByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public Long insert(User user) {
//        return null;
//    }
//
//    @Override
//    public Long findIdByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public String findEmailByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public String findPasswordByUsername(String username) {
//        return null;
//    }
//}
