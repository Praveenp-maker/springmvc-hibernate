package com.kgisl.service;

import java.util.List;

//import com.kgisl.entity.Customer;
import com.kgisl.entity.Event;

public interface EventService {
    public List < Event > getCustomers();
    public  void saveCustomer(Event theCustomer);
    public Event getCustomer(int theId);

    
}
