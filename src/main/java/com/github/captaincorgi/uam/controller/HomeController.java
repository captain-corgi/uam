package com.github.captaincorgi.uam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final String HOME_COMMING = "Home comming";

    @GetMapping("/")
    public String getHome() {
        System.out.println(HOME_COMMING);
        return HOME_COMMING;
    }
}
