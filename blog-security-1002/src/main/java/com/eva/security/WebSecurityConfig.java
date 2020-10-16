package com.eva.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AdminAuthenticationEntryPoint adminAuthenticationEntryPoint;

    //认证 登录
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*super.configure(auth);*/
        /*auth.userDetailsService();*/
    }

    //授权 链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*antMatchers括号里面定义的是api地址 */
//       http.authorizeRequests().antMatchers("/").hasRole();
        http.authorizeRequests().antMatchers("/ad/**").hasRole("vip");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        // 设置默认的加密方式（强hash方式加密）
        return new BCryptPasswordEncoder();
    }
}
