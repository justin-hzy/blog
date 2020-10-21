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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class DefaultFilter extends ZuulFilter {

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String REGEX = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";;

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
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        if(request.getRequestURI().contains("ad")){
            System.out.println("DefaultFilter生效");
            return true;
        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("DefaultFilter执行");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username="+username+",password="+password);

        boolean isMatch = Pattern.matches(REGEX,password);
        System.out.println("isMatch="+isMatch);
        if (isMatch==true){
            System.out.println("没有被DefaultFilter拦截了");
            currentContext.setSendZuulResponse(true);
        }else {
            System.out.println("被DefaultFilter拦截了");
            currentContext.setSendZuulResponse(false);
        }
        return null;
    }
}
