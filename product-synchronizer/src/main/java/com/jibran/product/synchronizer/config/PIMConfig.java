package com.jibran.product.synchronizer.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pim")
@Getter
@Setter
public class PIMConfig {
    private String filePath;
    private String url;
}
