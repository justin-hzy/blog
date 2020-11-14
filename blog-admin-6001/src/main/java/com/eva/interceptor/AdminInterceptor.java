package com.eva.interceptor;

import com.eva.controller.LoginController;
import com.eva.utils.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(AdminInterceptor.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("-------------------------------------------->进入preHandle");
        String authorization = request.getHeader("Authorization");

        String token = stringRedisTemplate.opsForValue().get("token");
        if (authorization.equals(token)){
            return true;
        }else {
            returnJson(response,JSONResult.build(405,"没有权限请登录",null));
            return false;
        }

    }

    private void returnJson(HttpServletResponse response, JSONResult json){
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {
            logger.error("response error",e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }
}
