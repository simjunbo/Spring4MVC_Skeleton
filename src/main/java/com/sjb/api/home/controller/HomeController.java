package com.sjb.api.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView helloWorldToView() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/hello.string", method = RequestMethod.GET)
    public String helloWorldToString() {
        return "hello";
    }

    @RequestMapping(value = "/hello.json", method = RequestMethod.GET)
    public Map<String, String> helloWorldToJson() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "aiden");
        return map;
    }
}

