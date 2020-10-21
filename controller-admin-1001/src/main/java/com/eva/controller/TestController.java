package com.eva.controller;

import com.eva.service.FeignService;
import com.eva.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class TestController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hello/{id}")
    public JSONResult Hello(@PathVariable("id") int id){
        String str = null;
        switch (id){
            case 1:
                 str = feignService.hello1();
                break;
            case 2:
                 str = feignService.hello2();
                break;
            case 3:
                str = feignService.hello3();
                break;
            case 4:
                str = feignService.hello4();
                break;
        }
        if (str != null){
            return JSONResult.build(200,"执行成功",str);
        }else{
            return JSONResult.build(404,"执行失败",null);
        }
    }
}
