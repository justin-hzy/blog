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
    public JSONResult selectBlogs(PageRequest pageRequest ) {
        return JSONResult.build(201,"selectBlogs服务降级",null);
    }

    @Override
    public JSONResult selectBlogsByRecommend() {
        return JSONResult.build(201,"selectBlogsByRecommend服务降级",null);
    }

    @Override
    public JSONResult selectTypes() {
        return JSONResult.build(201,"selectTypes服务降级",null);
    }

    @Override
    public JSONResult selectTags() {
        return JSONResult.build(201,"selectTags服务降级",null);
    }


}
