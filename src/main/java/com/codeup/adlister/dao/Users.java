package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public abstract class Users{
    private long id;
    private String username;
    private String email;
    private String password;

    public Users() {}

    public Users(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract User findByUsername(String username);

    public abstract Long insert(User user);
}