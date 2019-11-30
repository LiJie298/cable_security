package com.bishe.cable_security.service.impl;

import com.bishe.cable_security.model.SecurityUser;
import com.bishe.cable_security.model.User;
import com.bishe.cable_security.repository.UserRepository;
import com.bishe.cable_security.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl<T> implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User selectByAccount(String account) {
        return userRepository.getUserByAccount(account);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean updateUserPassword(String no, String password) {
        int updateUserNumber = userRepository.updateUserPwd(no, password);
        return updateUserNumber > 0;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.getUserByAccount(s);
        return new SecurityUser(user);
    }
}
