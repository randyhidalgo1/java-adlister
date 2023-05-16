package dao;

import model.Ad;
import javax.servlet.jsp.jstl.core.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class MySqlAdsDao implements AdsDao {
    private Connection connection;

    public MySqlAdsDao(Connection connection) {
        this.connection = connection;
    }

    public MySqlAdsDao() {

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public MySqlAdsDao(Config config) {
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
