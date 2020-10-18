package com.eva.filter;

import com.eva.pojo.UrlCollection;
import com.netflix.client.http.HttpRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class DefaultFilter extends ZuulFilter {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String filterType() {
        return "pre";
    }

    /*filterOrder 过滤器的执行顺序 0为第一个执行 以此类推 0、1、2。。。。*/
    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("执行shouldFilter");
        /*System.out.println("执行shouldFilter");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        if(request.getRequestURI().contains("ad")){
            *//* String value = (String) redisTemplate.boundValueOps("StringKey").get();*//*
            System.out.println("执行包含admin的api");
            return true;
        }else {
            System.out.println("过滤器不生效");
            return false;
        }*/
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("DefaultFilter执行");
      /*  RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        if(request.getRequestURI().contains("ad") & request.getRequestURI().contains("user")){
           *//* String value = (String) redisTemplate.boundValueOps("StringKey").get();*//*
            System.out.println("被DefaultFilter拦截了");
            currentContext.setSendZuulResponse(true);
        }else {
            *//*通过，filter 拦截*//*
            System.out.println("没有被DefaultFilter拦截了");
            currentContext.setSendZuulResponse(true);
        }*/
        return null;
    }
}
