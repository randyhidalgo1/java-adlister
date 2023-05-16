package dao;

import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    public static MySQLAdsDao getAdsDao() {
        return new MySQLAdsDao(new Config());
    }
}





//package dao;
//
//public class DaoFactory {
//    private static Ads adsDao;
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao();
//        }
//        return adsDao;
//    }
//
//    public static Ads getAuthorsDao() {
//        return null;
//    }
//}
