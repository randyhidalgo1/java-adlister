package com.codeup.adlister.dao;

import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static void setAdsDao(Ads adsDao) {
        DaoFactory.adsDao = adsDao;
    }
    public static Users getUsersDao() {
        return usersDao;
    }

    public static void setUsersDao(Users usersDao) {
        DaoFactory.usersDao = usersDao;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        DaoFactory.config = config;
    }

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;

    }

}
