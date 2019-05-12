package com.github.fish56.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用来测试AOP
 */
@RestController
public class AopController {
    @GetMapping("/aop")
    public String aop(@RequestParam Integer page,
                      @RequestParam Integer size){
        return "aop";
    }
}
