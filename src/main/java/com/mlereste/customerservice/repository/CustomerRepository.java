package com.mlereste.customerservice.repository;

import com.mlereste.customerservice.data.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
public interface CustomerRepository  extends MongoRepository<Customer, String> {

    List<Customer> findByLastName(String lastName);
}
