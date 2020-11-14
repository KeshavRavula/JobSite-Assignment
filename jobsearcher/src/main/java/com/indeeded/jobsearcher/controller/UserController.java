package com.indeeded.jobsearcher.controller;


import java.util.ArrayList;
import java.util.List;

import com.indeeded.jobsearcher.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.indeeded.jobsearcher.model.User;
//creating RestController
@RestController
@Service
public class UserController
{
    @Autowired
    UserRepo userRepo;
    //@RequestMapping("/user")
    @GetMapping("/user")
    private List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepo.findAll().forEach(user->users.add(user));
        return users;
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") int id)
    {
        return userRepo.findById(id).get();
    }
    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/user/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        userRepo.deleteById(id);
    }
    //creating post mapping that post the student detail in the database
    @PostMapping("/user")
    private int saveStudent(@RequestBody User user)
    {
        userRepo.save(user);
        return Integer.parseInt(user.getId());
    }
}