package com.jibran.product.synchronizer.processor;

import com.jibran.product.synchronizer.model.Product;
import com.jibran.product.synchronizer.utility.ProductSynchronizerUtil;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.util.List;


public class Processor implements FileAlterationListener {

    private RestTemplate restTemplate;
    private String url;

    public Processor(RestTemplate restTemplate, String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    @Override
    public void onStart(FileAlterationObserver observer) {

    }

    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {
        List<Product> products = ProductSynchronizerUtil.readAll(file);
        restTemplate.postForEntity(url, products, List.class);
    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onStop(FileAlterationObserver observer) {

    }
}
