//package controllers;
//
//import dao.DaoFactory;
//import model.Ad;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/ads/create")
//public class AdCreationServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/create.jsp").forward(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String title = request.getParameter("title");
//        String description = request.getParameter("description");
//
//        // Assuming you have a hardcoded user ID
//        int userId = 1;
//
//        Ad ad = new Ad(userId, title, description);
//        AdsDao adsDao = DaoFactory.getAdsDao();
//        adsDao.insertAd(ad);
//
//        response.sendRedirect("/ads");
//    }
//}
