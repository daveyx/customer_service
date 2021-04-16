package com.mlereste.customerservice.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.PostConstruct;

import static com.mlereste.customerservice.controller.CustomerController.CUSTOMERS_PATH;
import static io.restassured.RestAssured.get;

/**
 * Created by Marc Le Reste (chdlema) on 16/04/2021.<br/>
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerIT {

    public static final String BASE_PATH_URL = "http://localhost:";

    @LocalServerPort
    private int port;

    private String uri;


    @PostConstruct
    public void init() {
        uri = BASE_PATH_URL + port;
    }


    @AfterEach
    void tearDown() {
    }

    @Test
    void verify_getCustomers_return_OK_STATUS() {
        get(uri + CUSTOMERS_PATH).then()
                .assertThat()
                .statusCode(HttpStatus.OK.value());

    }

}