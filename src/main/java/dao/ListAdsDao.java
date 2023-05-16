package dao;

import model.Ad;

import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements AdsDao {
    private List<Ad> ads = new ArrayList<>();

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    @Override
    public List<Ad> getAllAds() {
        return null;
    }

    @Override
    public void insertAd(Ad ad) {

    }
    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
            1,
                "playstation for sale",
            "This is a slightly used playstation"
        ));
        ads.add(new Ad(
            2,
                "Super Nintendo",
            "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
            3,
                "Junior Java Developer Position",
            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
            4,
                "JavaScript Developer needed",
            "Must have strong Java skills"
        ));
        return ads;
    }
}
