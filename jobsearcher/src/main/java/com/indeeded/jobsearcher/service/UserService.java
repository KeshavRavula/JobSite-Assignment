package com.indeeded.jobsearcher.service;
import com.indeeded.jobsearcher.interfaces.UserRepo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.indeeded.jobsearcher.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepo.findAll().forEach(user -> users.add(user));
        return users;
    }
    public User getUser(int id)
    {
        return userRepo.findById(id).get();
    }
    public void saveUser(User user)
    {
        userRepo.save(user);
    }
    public void deleteUser(int id)
    {
        userRepo.deleteById(id);
    }
}
