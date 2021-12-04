package com.jibran.product.synchronizer.utility;

import com.jibran.product.synchronizer.model.Product;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface ProductSynchronizerUtil {
    static List<Product> readAll(File file) {
        try (Reader reader = new FileReader(file)) {
            CsvToBean<Product> csvToBean = new CsvToBeanBuilder<Product>(reader)
                    .withType(Product.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return constructProductList(csvToBean);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<Product> constructProductList(CsvToBean<Product> csvToBean){
        Iterator<Product> products = csvToBean.iterator();
        List<Product> productList = new ArrayList<>();
        while (products.hasNext()) {
            Product csvUser = products.next();
            productList.add(csvUser);
        }
        return productList;
    }

}
