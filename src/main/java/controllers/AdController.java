package controllers;

import dao.AdsDao;
import model.Ad;

public class AdController {
    public void createAd() {
        int userId = 1; // This is the hardcoded user ID
        Ad ad = new Ad(userId, "Ad Title", "Ad Description");
        AdsDao mySqlAdsDao = null;
        AdsDao adsDao = mySqlAdsDao;
        adsDao.insertAd(ad);
    }

}
