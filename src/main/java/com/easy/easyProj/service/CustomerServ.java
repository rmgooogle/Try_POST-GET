package com.easy.easyProj.service;

import com.easy.easyProj.model.Customer;

public interface CustomerServ {

    void addCustomer (int id, String name);
    Customer getCustomer (int id);
}
