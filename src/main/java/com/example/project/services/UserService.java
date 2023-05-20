package com.example.project.services;

import com.example.project.beans.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
    void deleteUserById(int id);
    User getUser(int id);
    int findUser(String username , String password);
    List<User> getAllUsers();
}
