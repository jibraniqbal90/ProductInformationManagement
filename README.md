# ProductInformationManagement
ProductInformationManagement System


## Environment for Development
 Those projects were developed with followings.

 * Java SDK 8 (1.8.0_112)
 * Spring-boot (2.3.0.RELEASE)
 * Apache Maven (3.6.2)

 ## Run the demo
 

POST
```
curl --location --request POST 'http://localhost:8081/products' \
--header 'Content-Type: application/json' \
--data-raw '[
     {

        "title": "Test 1",
        "description": "test1 desc",
        "price": 12.0,
        "quantity": 4
    }

]   
'
```

GET

```
curl --location --request GET 'http://localhost:8081/products/3' \
--header 'Content-Type: application/json' \
--data-raw '[
     {

        "title": "Java Fantastic, Very",
        "description": "desc2",
        "price": 12.0,
        "quantity": 4
    }

]   
'
```

PUT
```
curl --location --request PATCH 'http://localhost:8081/products' \
--header 'Content-Type: application/json' \
--data-raw '{
    "sku": 3,
    "title": "Java Fantastic, Very much too much",
    "description": "desc3",
    "price": 12.0,
    "quantity": 4
}'
```
