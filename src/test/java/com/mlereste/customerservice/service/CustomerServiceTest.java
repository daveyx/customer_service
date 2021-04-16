package com.mlereste.customerservice.service;

import com.mlereste.customerservice.data.model.Customer;
import com.mlereste.customerservice.fixture.CustomerFixture;
import com.mlereste.customerservice.repository.CustomerRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    CustomerRepository repositoryMock;

    @InjectMocks
    CustomerService serviceUnderTest;

    @Test
    void verify_getCustomers_return_with_2_customers() {

        //Given 2 customers mocked
        Mockito.when(repositoryMock.findAll()).thenReturn(CustomerFixture.customersMarcAndMartin);

        //When
        List<Customer> result = serviceUnderTest.getCustomers();

        //Then i expect to get 2 customers
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(2);

    }
}