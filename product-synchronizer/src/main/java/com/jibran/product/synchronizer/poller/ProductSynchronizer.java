package com.jibran.product.synchronizer.poller;

import com.jibran.product.synchronizer.config.PIMConfig;
import com.jibran.product.synchronizer.processor.Processor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
public class ProductSynchronizer {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PIMConfig pimConfig;


    private FileAlterationObserver observer;
    private FileAlterationMonitor monitor;

    @PostConstruct
    public void init() throws Exception {
        observer = new FileAlterationObserver(pimConfig.getFilePath());
        monitor = new FileAlterationMonitor();
        registerPoller();
    }

    private void registerPoller() throws Exception {
        observer.addListener(new Processor(restTemplate, pimConfig.getUrl()));
        monitor.addObserver(observer);
        monitor.start();
    }
}
