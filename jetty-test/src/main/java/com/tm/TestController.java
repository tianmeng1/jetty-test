package com.tm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/test")
public class TestController {

    public TestController() {
        System.out.println("====TestController====");
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        System.out.println("index....");
        ModelAndView view = new ModelAndView("index");
        return view;
    }
    
    @RequestMapping("/hello")
    public ModelAndView hello() {
        System.out.println("hello....");
        ModelAndView view = new ModelAndView("hello");
        return view;
    }
}
