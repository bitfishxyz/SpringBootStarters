package com.github.fish56.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 // 开发Swagger
public class MvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(MvcApplication.class);
    }
}
