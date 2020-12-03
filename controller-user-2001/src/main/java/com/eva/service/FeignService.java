package com.eva.service;

import com.eva.Impl.FeignFallBack;
import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*,fallback = FeignFallBack.class*/
@FeignClient(value = "blog-user")
@Service
public interface FeignService {

    //服务中方法的映射路径


    @PostMapping("/blogs/selectBlogs")
    JSONResult selectBlogs();
}
