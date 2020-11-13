package com.indeeded.jobsearcher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String loginpage(@RequestParam String userName, String password){
        return "login";
        }
}
