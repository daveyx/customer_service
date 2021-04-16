package com.mlereste.customerservice.repository;

import com.mlereste.customerservice.data.model.Customer;
import com.mlereste.customerservice.fixture.CustomerFixture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static com.mlereste.customerservice.fixture.CustomerFixture.LAST_NAME_LE_RESTE;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
@ExtendWith(SpringExtension.class)
@DataMongoTest
class CustomerRepositoryIT {

    @Autowired
    CustomerRepository classUnderTest;

    public static final Customer CUSTOMER_MARC_LE_RESTE = CustomerFixture.CUSTOMER_MARC_LE_RESTE;


    @BeforeEach
    void setUp() {
        List<Customer> customers = new ArrayList<>();
        customers.add(CUSTOMER_MARC_LE_RESTE);
        customers.add(CustomerFixture.CUSTOMER_MARTIN_FOWLER);

        classUnderTest.saveAll(customers);
    }

    @AfterEach
    void tearDown() {
        classUnderTest.deleteAll();
    }

    @Test
    void verify_findByLastName_exist() {

        //Given an existing customer in DB

        //When a call findByLastName
        List<Customer> result = classUnderTest.findByLastName(LAST_NAME_LE_RESTE);

        //Then i expected to get "marc le reste" customer
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(1);

        Customer resultCustomer = result.get(0);
        assertThat(resultCustomer.getLastName()).isEqualTo(LAST_NAME_LE_RESTE);
    }
}