package com.zealer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserControlller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView method(){
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("nums",100);
        return modelAndView;
    }
}


