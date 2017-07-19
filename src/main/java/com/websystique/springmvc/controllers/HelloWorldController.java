package com.websystique.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Qiushi on 7/18/2017.
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap map) {
        map.addAttribute("greeting", "hello spring 4 mvc");
        return "welcome";
    }

    @RequestMapping(value = "/helloAgain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap map) {
        map.addAttribute("greeting", "hello again spring 4 mvc");
        return "welcome";
    }
}
