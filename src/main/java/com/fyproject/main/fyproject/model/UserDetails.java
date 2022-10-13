package com.fyproject.main.fyproject.model;

import org.springframework.boot.jackson.JsonComponent;

public class UserDetails {
    private String password;
    private String email;

    public UserDetails(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public UserDetails() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
