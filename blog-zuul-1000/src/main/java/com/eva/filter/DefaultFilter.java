package com.eva.filter;

import com.eva.pojo.UrlCollection;
import com.netflix.client.http.HttpRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class DefaultFilter extends ZuulFilter {

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
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        StringBuffer stringBuffer = request.getRequestURL();

        String  username = request.getParameter("username");
        System.out.println("------------ username="+username);
        if (StringUtils.isEmpty(username)){
            currentContext.setSendZuulResponse(false);
            HttpServletResponse response = currentContext.getResponse();
            try {
                int responseStatusCode =  currentContext.getResponseStatusCode();
                String str = "username为空，程序不再向下执行";
                response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
                response.getOutputStream().write(str.getBytes());
            } catch (IOException e) {
                ReflectionUtils.rethrowRuntimeException(e);
                e.printStackTrace();
            }
//            currentContext.setSendZuulResponse(false); //不会继续往下执行 不会调用服务接口了 网关直接响应给客户了
//            currentContext.setResponseBody("username为空，程序不再向下执行");
//            currentContext.setResponseStatusCode(401);

        }



        return null;
    }
}
