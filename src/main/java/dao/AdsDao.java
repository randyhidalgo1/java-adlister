package dao;

import model.Ad;

import java.util.List;


public interface AdsDao {
    List<Ad> getAllAds();
    void insertAd(Ad ad);
}

