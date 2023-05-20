package com.example.project.webServices;

import com.example.project.beans.User;
import com.example.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @PostMapping("/add")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping  ("/auth")
    public int findUser(@RequestBody User user) {
        return userService.findUser(user.getUsername(), user.getPassword());
    }


    @Autowired
    private UserService userService;



}
