package com.eva;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Admin的controller层
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka
public class BlogSecurityApplication_1002
{
    public static void main( String[] args )
    {
        SpringApplication.run(BlogSecurityApplication_1002.class,args);
    }
}
