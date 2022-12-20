package com.kgisl.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgisl.entity.Event;
//import com.mysql.cj.Query;
@Repository
public class EventDAOImpl implements EventDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void saveCustomer(Event theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }



    @Override
    public List < Event > getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Event > cq = cb.createQuery(Event.class);
        Root < Event > root = cq.from(Event.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public Event getCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Event theCustomer = currentSession.get(Event.class, theId);
        return theCustomer;
    }
    
}
