package com.kgisl.dao;

import java.util.List;

import com.kgisl.entity.Event;
//import com.kgisl.service.List;

public interface EventDAO {
    public void saveCustomer(Event theCustomer);

    public List<Event> getCustomers();

    public Event getCustomer(int theId);

    
}
