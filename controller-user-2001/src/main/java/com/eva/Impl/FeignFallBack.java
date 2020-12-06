package com.eva.Impl;

import com.eva.dto.Type;
import com.eva.dto.User;
import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import com.eva.utils.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class FeignFallBack implements FeignService {


    @Override
    public JSONResult selectBlogs() {
        return JSONResult.build(201,"selectBlogs服务降级",null);
    }


}
