package com.easy.easyProj.service.implem;

import com.easy.easyProj.model.Customer;
import com.easy.easyProj.service.CustomerServ;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServMemoryImpl implements CustomerServ {
    Map<Integer, Customer> myData = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        myData.put(id, new Customer(id,name));

    }

    @Override
    public Customer getCustomer(int id) {
        return myData.get(id);
    }
}
