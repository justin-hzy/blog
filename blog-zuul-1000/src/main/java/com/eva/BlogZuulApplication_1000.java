package com.eva;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Admin的controller层
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka
@EnableZuulProxy //
public class BlogZuulApplication_1000
{
    public static void main( String[] args )
    {
        SpringApplication.run(BlogZuulApplication_1000.class,args);
    }
}
