package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(isValid(username, email, password)) {
            // Create a new user based on the submitted information
            Long userId = DaoFactory.getUsersDao().insert(username, email, password);
            User newUser = new User(username, email, password);

            if (userId != null) {
                response.sendRedirect("profile");
            } else {
                request.setAttribute("errorMessage", "An error occurred during registration. Please try again.");
                request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("errorMessage", "Invalid data provided. Please try again.");
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
    }
    private boolean isValid(String username, String email, String password) {
            return true;
    }
}
