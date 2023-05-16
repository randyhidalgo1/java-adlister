package controllers;

import dao.Ads;
import dao.MySQLAdsDao;
import model.Ad;

import java.sql.SQLException;

public class AdController {
    public void createAd() throws SQLException {
        int userId = 1; // This is the hardcoded user ID
        Ad ad = new Ad(userId, "Ad Title", "Ad Description");
        Ads mySqlAdsDao = null;
        Ads adsDao = (Ads) new MySQLAdsDao(); // Instantiate the AdsDao implementation
        adsDao.insertAd(ad);
    }

}
