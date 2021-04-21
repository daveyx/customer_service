package com.mlereste.customerservice.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Marc Le Reste (chdlema) on 19/04/2021.<br/>
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String streetNumber;
    private String city;
    private int zipCode;
}
