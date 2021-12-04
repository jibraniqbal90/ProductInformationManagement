# ProductInformationManagement
ProductInformationManagement System

# How to use?

* Git clone
```console
$ git clone https://github.com/jibraniqbal90/ProductInformationManagement.git
```

* Run the docker compose up from the root of the project ProductInformationManagement

```console
$ docker compose up
```

That's it. run the cURLS mentioned below or use postman (collection attached)

## Docker Hub

https://hub.docker.com/r/jibraniqbal/postgres

https://hub.docker.com/r/jibraniqbal/product-information-management

https://hub.docker.com/repository/docker/jibraniqbal/product-synchronizer

## Without docker compose : install docker and run below commands

* This image uses following commands for configuration.
* Run DB first followed by Application.

|docker commands     |Default value        |Description                                         |
|------------------------|---------------------|----------------------------------------------------|
|`Docker db run`    |no default           |$docker run -it -p 5432:5432  jibraniqbal/postgres:latest .|
|`Docker app run`    |no default           |$docker run -it -p 8081:8081 jibraniqbal/product-information-management:1.0.0           |


## Environment for Development
 Those projects were developed with followings.

 * Java SDK 11
 * Spring-boot
 * Gradle
 * Docker

 ## CURLS or postman


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

#Screenshots

![alt text](https://raw.githubusercontent.com/jibraniqbal90/ProductInformationManagement/main/screenshots/1docker.png "preview1")
![alt text](https://raw.githubusercontent.com/jibraniqbal90/ProductInformationManagement/main/screenshots/2postman.png "preview2")
