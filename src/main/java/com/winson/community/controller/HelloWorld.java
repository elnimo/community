package com.winson.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description：
 * @Date： 2019/8/13 22:24
 * @Author： winson
 */
@Controller
public class HelloWorld {

    /**
     * @param name
     * @param model :相当于一个map
     * @return
     */
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
