package com.newtouch.cloud.serviceuser.controller;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class NewAppUser {

    @Pattern(regexp = "[\\w]{4,30}")
    private String username;

    @Email
    @NotNull
    private String email;

    @Pattern(regexp = "(\\w|\\p{Punct}){6,30}")
    private String password;

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
}
