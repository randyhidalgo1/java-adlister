package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public interface UsersDao {
    String findUsernameById(long id);
    User findByUsername(String username);
    Long insert(User user);
    Long findIdByUsername(String username);
    String findEmailByUsername(String username);
    String findPasswordByUsername(String username);

    Long insert(String username, String email, String password);
}
