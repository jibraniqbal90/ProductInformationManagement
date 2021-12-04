package com.jibran.product.information.management.api;


import com.jibran.product.information.management.persistence.entity.Product;
import com.jibran.product.information.management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductAPI {

    @Autowired
    private ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Product> persist(@RequestBody List<Product> products){
        return service.persist(products);
    }

    @GetMapping("/{sku}")
    @ResponseStatus(HttpStatus.OK)
    public Product get(@PathVariable Long sku){
        return service.get(sku);
    }


    @PatchMapping()
    public Product update(@RequestBody Product product){
        return service.update(product);
    }

}
