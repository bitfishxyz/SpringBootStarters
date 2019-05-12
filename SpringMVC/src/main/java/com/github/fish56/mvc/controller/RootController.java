package com.github.fish56.mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RootController {
    @GetMapping("/")
    public String hello(){
        log.info("receive a request");
        return "hello";
    }

    @GetMapping("/exception")
    public String exception(){
        throw new RuntimeException();
    }
}
