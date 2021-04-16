package com.mlereste.customerservice.fixture;

import com.mlereste.customerservice.data.model.Customer;

import java.util.List;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
public class CustomerFixture {
    public static String LAST_NAME_LE_RESTE = "Le Reste";

    public static Customer CUSTOMER_MARC_LE_RESTE = Customer.builder().firstName("marc").lastName(LAST_NAME_LE_RESTE).build();
    public static Customer CUSTOMER_MARTIN_FOWLER  = Customer.builder().firstName("martin").lastName("fowler").build();

    public static List<Customer> customersMarcAndMartin =  List.of(CUSTOMER_MARC_LE_RESTE,CUSTOMER_MARC_LE_RESTE);
}
