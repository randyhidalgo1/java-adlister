package com.codeup.adlister.dao;

public interface UsersDao {
    String findUsernameById(long id);
    Long insert(String username, String email, String password);
    Long findIdByUsername(String username);
    String findEmailByUsername(String username);
    String findPasswordByUsername(String username);

    // User findByUsername(String username);
    // Long insert(User user);
}
