package com.codeup.adlister.dao;

// Maybe change to Ads from UserDao in DAO FActory
public class DaoFactory {
    private static UsersDao usersDao;
    private static Config config = new Config();

    public static UsersDao getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public static void setUsersDao(UsersDao usersDao) {
        DaoFactory.usersDao = usersDao;
    }

    public static void setUsersDao(Users usersDao) {
        DaoFactory.usersDao = (UsersDao) usersDao;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        DaoFactory.config = config;
    }

    public static AdsDao getAdsDao() {
        AdsDao adsDao = null;
        adsDao = new MySQLAdsDao(config);
        return adsDao;
    }


}
