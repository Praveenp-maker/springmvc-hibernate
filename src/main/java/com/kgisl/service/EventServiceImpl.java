package com.kgisl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.dao.EventDAO;
import com.kgisl.entity.Event;

//import antlr.collections.List;
@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventDAO eventDAO;
    @Override
    @Transactional
    public void saveCustomer(Event theCustomer) {
        eventDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public List < Event > getCustomers() {
        return eventDAO.getCustomers();
    }

    @Override
    @Transactional
    public Event getCustomer(int theId) {
        return eventDAO.getCustomer(theId);
    }

    
}
