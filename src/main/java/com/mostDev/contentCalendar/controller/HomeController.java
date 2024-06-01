package com.mostDev.contentCalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home() {
        return "Home";
    }

    @RequestMapping("/Login")
    public String Login(){
        return "login";
    }

    @RequestMapping("/Register")
    public String Register(){
        return "register";
    }

    @RequestMapping("/Profile")
    public String Profile(){
        return "profile";
    }


}
