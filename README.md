# ProductInformationManagement
ProductInformationManagement System

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
