package com.ugrcyo.crud.controller;

import com.ugrcyo.crud.entity.User;
import com.ugrcyo.crud.repository.UserRepository;
import com.ugrcyo.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    @CrossOrigin(origins = "http://localhost:4200")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }


    @PostMapping("/addUsers")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> addUsers(@RequestBody List<User> users) {
        return service.saveUsers(users);
    }

    @GetMapping("/users")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/userById/{id}")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @GetMapping("/user/{name}")
    public User findUserByName(@PathVariable String name) {
        return service.getUserByName(name);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
}
