package com.mostDev.contentCalendar.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;



public class User {

    @Id
    Integer id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public User(Integer id, String username, String password) {
        this.username = username;
        this.password = password;

    }


}
