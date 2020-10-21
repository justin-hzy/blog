package com.eva.service;

import com.eva.Impl.FeignFallBack;
import com.eva.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "blog-admin",fallback = FeignFallBack.class )
@Service
public interface FeignService {

    //服务中方法的映射路径
    @RequestMapping("/hello1")
    String hello1();

    @RequestMapping("/hello2")
    String hello2();

    @RequestMapping("/hello3")
    String hello3();

    @RequestMapping("/hello4")
    String hello4();

    @PostMapping("/admin/login")
    User login(@RequestParam String username, @RequestParam String password);

}
