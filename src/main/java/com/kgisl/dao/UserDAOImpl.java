package com.kgisl.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import javax.persistence.Query;

import com.kgisl.entity.User;

//import antlr.collections.List;
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void saveRegister(User theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }
@Override
public List<User> loginUser(User user){
    Session session = sessionFactory.openSession();

  System.out.println("check the login");
  System.out.println(user.getUsername());
    try {
     Query query = session.createQuery("from User where username =?0 and password = ?1");
    // Query query = session.createQuery("select username,password from User");
     query.setParameter(0, user.getUsername());
     query.setParameter(1, user.getPassword());
    System.out.println(query.getResultList());

    return query.getResultList();
    }catch (NoResultException e) {
     // TODO: handle exception
     return null;
    }

}
    
}
