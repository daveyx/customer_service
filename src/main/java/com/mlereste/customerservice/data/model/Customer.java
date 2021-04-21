package com.mlereste.customerservice.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */


@Document(collection = "customer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Address address;

}
