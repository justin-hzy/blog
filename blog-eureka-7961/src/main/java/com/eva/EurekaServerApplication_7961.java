package com.eva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka
public class EurekaServerApplication_7961
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication_7961.class,args);
    }
}
