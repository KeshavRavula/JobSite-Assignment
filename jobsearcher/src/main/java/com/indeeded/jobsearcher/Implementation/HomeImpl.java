package com.indeeded.jobsearcher.Implementation;


import com.indeeded.jobsearcher.interfaces.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeImpl {

    @Autowired
    UserRepo userRepo;

    public void getUser(){

    }
}
