package com.eva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BlogIntegralApplication_5001 {

    public static void main(String[] args) {
        SpringApplication.run(BlogIntegralApplication_5001.class, args);
    }

}
