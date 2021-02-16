package com.spring.springjpa.Service;

import com.spring.springjpa.Model.User;
import com.spring.springjpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User>  getUsers()
    {
    return userRepository.findAll();
    }

    public User getUser(int id)
    {
        return userRepository.findById(id).get();//get for optional value
    }
    public void insertUser(User user)
    {
        userRepository.save(user);
    }
    public void deleteUser(int id)
    {
        userRepository.deleteById(id);
    }
}
