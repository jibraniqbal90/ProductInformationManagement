package com.jibran.product.information.management.api;

import com.jibran.product.information.management.persistence.entity.Product;
import com.jibran.product.information.management.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ProductAPITest {

    @InjectMocks
    private ProductAPI productAPI;

    @Mock
    private ProductService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void persistTest(){
        Mockito.when(service.persist(Mockito.anyList())).thenReturn(PayloadHelper.getProductList());
        List<Product> response = productAPI.persist(Mockito.anyList());
        Assertions.assertNotNull(response);

        Assertions.assertEquals(1L, response.get(0).getSku());
    }


    @Test
    public void getTest(){
        Mockito.when(service.get(Mockito.any())).thenReturn(PayloadHelper.getProductList().get(0));
        Product response = productAPI.get(Mockito.any());
        Assertions.assertEquals(1L, response.getSku());
    }


    @Test
    public void updateTest(){
        Mockito.when(service.update(Mockito.any())).thenReturn(PayloadHelper.getProductList().get(0));
        Product response = productAPI.update(Mockito.any());
        Assertions.assertEquals(1L, response.getSku());
    }




}
