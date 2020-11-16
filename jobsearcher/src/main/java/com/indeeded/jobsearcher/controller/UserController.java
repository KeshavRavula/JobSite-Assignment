package com.indeeded.jobsearcher.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.indeeded.jobsearcher.model.User;
import com.indeeded.jobsearcher.service.UserService;

//creating RestController
@RestController
public class UserController
{
    @Autowired
    UserService userService;
    //@RequestMapping("/user")
    @GetMapping("/user")
    private List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") int id)
    {
        return userService.getUser(id);
    }
    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/user/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        userService.deleteUser(id);
    }
    //creating post mapping that post the student detail in the database
    @PostMapping("/user")
    private int saveUser(@RequestBody User user)
    {
        userService.saveUser(user);
        return Integer.parseInt(user.getId());
    }
}