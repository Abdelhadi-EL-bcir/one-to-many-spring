package com.example.project.dao;

import com.example.project.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositiry extends JpaRepository<User , Integer> {
    public User findByUsernameAndAndPassword(String suername , String password);
}
