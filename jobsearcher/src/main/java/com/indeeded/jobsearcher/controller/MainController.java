package com.indeeded.jobsearcher.controller;


import com.indeeded.jobsearcher.Implementation.HomeImpl;
import com.indeeded.jobsearcher.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    HomeImpl homeImpl;

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage(Model model){

       // model.addAttribute("userObject",User);
        return "login";
    }


}
