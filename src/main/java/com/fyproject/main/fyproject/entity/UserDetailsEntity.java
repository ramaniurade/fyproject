package com.fyproject.main.fyproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetailsEntity {

    @Id
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "password")
    private String password;

    public UserDetailsEntity(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserDetailsEntity() {
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
}
