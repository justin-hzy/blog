package com.eva;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * user的service层
 *
 */

@MapperScan("com.eva.mapper")
@SpringBootApplication
@EnableEurekaClient
public class UserApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApplication.class,args);
    }
}
