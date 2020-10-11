package com.eva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User的controller层
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka
public class ControllerUserApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ControllerUserApplication.class,args);
    }
}
