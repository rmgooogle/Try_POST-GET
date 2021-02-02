package com.easy.easyProj.controller;

import com.easy.easyProj.model.Customer;
import com.easy.easyProj.service.CustomerServ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerContr {

    private CustomerServ customerServ;

    public CustomerContr(CustomerServ customerServ) {
        this.customerServ = customerServ;
    }

    @PostMapping
    public void addCustomer (@RequestParam int id, @RequestParam String name){
      customerServ.addCustomer(id, name);
    }

    @GetMapping
    public Customer getCustomer (@RequestParam int id) {
        return customerServ.getCustomer(id);
    }

}
