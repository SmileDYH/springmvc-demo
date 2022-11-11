package com.dyh.springmvc.controller;

import com.dyh.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * description:
 * author: dyh
 * date: 2022/11/8 15:46
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    @Qualifier("demoService")
    private DemoService demoService;

    //@ResponseBody 返回数据（body对象）
    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        return demoService.get();
    }

    //返回hello.jsp页面, spring-mvc.xml中配置
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    //返回newhello.jsp页面, newhello.jsp能通过${object}能获取到object对象值
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("object","objectX");
        modelAndView.setViewName("newhello");
        return modelAndView;
    }

}
