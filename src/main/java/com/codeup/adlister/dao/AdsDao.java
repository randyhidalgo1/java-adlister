package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface AdsDao {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    Ad findAdById(long id);

    // Update a specific ad
    boolean updateAd(Ad ad);

    // Delete a specific ad by its id
    boolean deleteAd(long id);

}