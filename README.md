# customer_service

The goal of this project is to give an idea about Rest implementation with Java / Spring boot with tests.
Implementation is quite simple with just 1 endpoint.
The focus is on  unit / integration / e2e tests.

##Rest endpoint samples
### GET /customers
curl  --request GET 'http://localhost:8080/api/customers'

### POST /customers

curl --request POST 'http://localhost:8080/api/customers' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "marc",
    "lastName": "le reste",
    "address": {
        "street":"kirchgasse",
        "streetNumber": 18,
        "city": "Winterthur",
        "zipCode": 8400
        }
}'
##Testing

###Unit test
Mockito + Junit 5 + assertJ

### Integration test
Spring test + Spring data

### API end to end test
RestAssured 

###Build Rest API
https://blog.octo.com/wp-content/uploads/2014/12/OCTO-Refcard_API_Design_EN_3.0.pdf
