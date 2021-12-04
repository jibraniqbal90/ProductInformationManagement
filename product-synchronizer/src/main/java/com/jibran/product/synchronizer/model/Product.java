package com.jibran.product.synchronizer.model;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    @CsvBindByName
    private Long sku;

    @CsvBindByName
    private String title;

    @CsvBindByName
    private String description;

    @CsvBindByName
    private Double price;

    @CsvBindByName
    private Long quantity;
}
