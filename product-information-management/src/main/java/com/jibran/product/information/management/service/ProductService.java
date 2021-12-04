package com.jibran.product.information.management.service;

import com.jibran.product.information.management.exception.ProductNotFoundException;
import com.jibran.product.information.management.persistence.entity.Product;
import com.jibran.product.information.management.persistence.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> persist(List<Product> list){
        return repo.saveAll(list);
    }

    public Product get(Long sku){
        return repo.findBySku(sku).orElseThrow(()->new ProductNotFoundException("Product with given SKU not Found"));
    }

    public Product update(Product product){
        get(product.getSku());
        return repo.save(product);
    }
}
