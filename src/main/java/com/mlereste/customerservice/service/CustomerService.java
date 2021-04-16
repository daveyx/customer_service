package com.mlereste.customerservice.service;

import com.mlereste.customerservice.data.model.Customer;
import com.mlereste.customerservice.repository.CustomerRepository;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
@Service
public class CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
