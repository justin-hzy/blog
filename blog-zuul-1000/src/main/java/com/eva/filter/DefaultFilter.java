package com.eva.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;


public class DefaultFilter extends ZuulFilter {

    //同一時刻允許請求的個數 3個
    private RateLimiter rateLimiter = RateLimiter.create(2);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

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
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletResponse response =
                requestContext.getResponse();
        if (!rateLimiter.tryAcquire()){
            HttpStatus status =
                    HttpStatus.TOO_MANY_REQUESTS;
            response.setContentType(MediaType.TEXT_PLAIN_VALUE);
            response.setStatus(status.value());
            requestContext.setSendZuulResponse(false);
            throw new ZuulException(status.getReasonPhrase(),status.value(),status.getReasonPhrase());
        }
        return null;
    }
}
