package com.bishe.cable_security.service;

import com.bishe.cable_security.model.User;

import java.util.List;

public interface UserService {

    User selectByAccount(String account);

    List<User> findAll();

    boolean updateUserPassword(String no,String password);

    boolean addUser(User user);
}
