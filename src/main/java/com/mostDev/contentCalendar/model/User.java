package com.mostDev.contentCalendar.model;

import org.springframework.data.annotation.Id;



public class User {

    @Id
    int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
