package com.eva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * User的controller层
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka
@EnableFeignClients
@EnableHystrixDashboard //开启
public class ControllerUserApplication_2001
{
    public static void main( String[] args )
    {
        SpringApplication.run(ControllerUserApplication_2001.class,args);
    }
}
