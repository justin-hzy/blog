package com.eva.service.Impl;

import com.eva.service.TestService;
import org.springframework.stereotype.Service;

@Service(value = "TestServiceImpl1")
public class TestServiceImpl1 implements TestService {
    @Override
    public String test() {
        return "TestServiceImpl1";
    }
}
