package com.eva;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * admin的service层
 *
 */
@MapperScan("com.eva.mapper")
@SpringBootApplication
@EnableEurekaClient //开启Eureka
@EnableDiscoveryClient
@EnableCircuitBreaker//添加对熔断的支持
public class AdminApplication_6001
{
    public static void main( String[] args )
    {
        SpringApplication.run(AdminApplication_6001.class,args);
    }

    /*维拉配合监控编写的固定代码，增加一个servlet*/
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
