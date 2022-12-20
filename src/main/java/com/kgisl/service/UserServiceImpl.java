package com.kgisl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.dao.UserDAO;
import com.kgisl.entity.User;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public void saveRegister(User theCustomer) {
        userDAO.saveRegister(theCustomer);
    }
    

    @Override
 public List<User> loginUser(User user) {
  // TODO Auto-generated method stub
  return userDAO.loginUser(user);
 }
}
