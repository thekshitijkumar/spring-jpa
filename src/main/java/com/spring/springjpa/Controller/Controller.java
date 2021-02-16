package com.spring.springjpa.Controller;

import com.spring.springjpa.Model.User;
import com.spring.springjpa.Repository.UserRepository;
import com.spring.springjpa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
public class Controller {



    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

//    @GetMapping("/user")
//    public User getUser(@RequestParam("id") int id)
//    {
//        //return user;
//        return userService.getUser(id);
//    }

    @PostMapping("/user")
    public void insertUser(@RequestBody  User user)
    {
        //insert user data
        userService.insertUser(user);

    }
//    @DeleteMapping("/user")
//    public void deleteUser(@RequestParam("id") int  id)
//    {
//        userService.deleteUser(id);
//    }

}
