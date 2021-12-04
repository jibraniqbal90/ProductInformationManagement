package com.jibran.product.information.management.api;

import com.jibran.product.information.management.persistence.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface PayloadHelper {

    static List<Product> getProductList() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1L, "Product One title", "Product One Description", 50.0, 1));
        products.add(new Product(2L, "Product Two title", "Product Two Description", 100.0, 2));
        return products;
    }

}
