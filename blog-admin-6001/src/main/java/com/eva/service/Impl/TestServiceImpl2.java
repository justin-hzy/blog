package com.eva.service.Impl;

import com.eva.service.TestService;
import org.springframework.stereotype.Service;

@Service(value = "TestServiceImpl2")
public class TestServiceImpl2 implements TestService {
    @Override
    public String test() {
        return "TestServiceImpl2";
    }
}
