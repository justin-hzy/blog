package com.eva;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Admin的controller层
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka
@EnableFeignClients
@EnableHystrixDashboard //开启
public class ControllerAdminApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ControllerAdminApplication.class,args);
    }
}
