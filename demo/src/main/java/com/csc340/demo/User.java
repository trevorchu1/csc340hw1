package com.csc340.demo;

public class User {
    public String name;
    public String username;
    public String email;
    public String website;


    public User(String name, String username, String email, String website) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getWebsite() {
        return website;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
