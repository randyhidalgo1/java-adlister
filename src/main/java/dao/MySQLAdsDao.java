package dao;

import model.Ad;

import javax.servlet.jsp.jstl.core.Config;
import java.util.List;
import java.sql.*;


public class MySQLAdsDao implements AdsDao {
    private Connection connection;

    public MySQLAdsDao(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public MySQLAdsDao(Config config) {
        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");

        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> getAllAds() {
        // Implement your method here
        return null;
    }

    @Override
    public void insertAd(Ad ad) {
        // Implement your method here
    }

}
