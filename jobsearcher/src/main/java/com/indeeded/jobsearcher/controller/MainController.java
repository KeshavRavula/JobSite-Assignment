package com.indeeded.jobsearcher.controller;



import com.indeeded.jobsearcher.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value="/login")
    public String loginPage(String userName,String password, Model model){
        System.out.println("UserName" +userName);
        System.out.println("Password" +password);
        return "home";
    }


}
