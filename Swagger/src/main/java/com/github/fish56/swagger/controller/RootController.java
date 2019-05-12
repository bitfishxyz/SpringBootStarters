package com.github.fish56.swagger.controller;

import com.github.fish56.swagger.domain.Monkey;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class RootController {
    @ApiOperation("通过ID查询🐒")
    @GetMapping("/monkeys/{id}")
    public Monkey monkey(@PathVariable Integer id){
        return getMonkey(id);
    }

    @GetMapping("/monkey")
    public Monkey monkey2(@ApiParam(value = "通过🐒id来查询用户") @RequestParam Integer id){
        return getMonkey(id);
    }

    private Monkey getMonkey(Integer id){
        Monkey monkey = new Monkey();
        monkey.setId(id);
        monkey.setName("孙悟空");
        monkey.setLocation("花果山");
        return monkey;
    }

    @PostMapping("/monkey")
    public Monkey postMonkey(@ApiParam(value = "新的猴子") @RequestBody Monkey monkey){
        return monkey;
    }
}
