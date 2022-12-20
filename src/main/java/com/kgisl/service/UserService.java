package com.kgisl.service;

import java.util.List;

//import java.util.List;

import com.kgisl.entity.User;

public interface UserService {

    public  void saveRegister(User theCustomer);
    public List<User> loginUser(User user);
    
}
