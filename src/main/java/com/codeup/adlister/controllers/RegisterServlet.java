package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp")
            .forward(request, response);
        // TODO: show the registration form
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(isValid(username, email, password)) {
            // Create a new user based on the submitted information
            username newUser = new username (username, email, password);
            // Add the user to your data store here

            // If a user was successfully created, send them to their profile
            response.sendRedirect("profile");
        } else {
            // If the user data was not valid, you could optionally redirect back to the registration form with an error message
            request.setAttribute("errorMessage", "Invalid data provided. Please try again.");
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
    }

    private boolean isValid(String username, String email, String password) {
        return username != null && !username.isEmpty() &&
                email != null && !email.isEmpty() &&
                password != null && !password.isEmpty();
    }

}
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile

