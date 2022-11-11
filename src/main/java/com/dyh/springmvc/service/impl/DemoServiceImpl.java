package com.dyh.springmvc.service.impl;

import com.dyh.springmvc.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: dyh
 * date: 2022/11/8 15:49
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String get(){
        return "hello demo";
    }
}
