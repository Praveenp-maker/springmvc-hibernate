package com.kgisl.dao;

import java.util.List;

import com.kgisl.entity.User;

public interface UserDAO {
    public void saveRegister(User theCustomer);
    public List<User> loginUser(User user);
}
