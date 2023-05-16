package controllers;

import dao.AdsDao;
import dao.MySqlAdsDao;
import model.Ad;

public class AdController {
    public void createAd() {
        int userId = 1; // This is the hardcoded user ID
        Ad ad = new Ad(userId, "Ad Title", "Ad Description");
        AdsDao mySqlAdsDao = null;
        AdsDao adsDao = new MySqlAdsDao(); // Instantiate the AdsDao implementation
        adsDao.insertAd(ad);
    }

}
