package com.example.project.servicesImpl;

import com.example.project.beans.User;
import com.example.project.dao.UserRepositiry;
import com.example.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepositiry userRepositiry ;

    @Override
    public User saveUser(User user) {
        return userRepositiry.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepositiry.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepositiry.delete(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepositiry.deleteById(id);
    }

    @Override
    public User getUser(int id) {
        return userRepositiry.findById(id).get();
    }

    @Override
    public int findUser(String username, String password) {
        User user = userRepositiry.findByUsernameAndAndPassword(username , password);
        if(user != null){
            return  1;
        }else{
            return  -1;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositiry.findAll();
    }
}
