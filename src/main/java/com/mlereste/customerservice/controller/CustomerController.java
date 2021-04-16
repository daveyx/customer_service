package com.mlereste.customerservice.controller;

import com.mlereste.customerservice.data.model.Customer;
import com.mlereste.customerservice.service.CustomerService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
@RestController
@RequestMapping("/api/")
public class CustomerController {

    final
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
}
