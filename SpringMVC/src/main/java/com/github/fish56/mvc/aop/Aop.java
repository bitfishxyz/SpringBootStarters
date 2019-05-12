package com.github.fish56.mvc.aop;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * aop的方式可以拿到Controller方法的参数
 * 这是filter和interceptor所不具备的能力
 */
@Slf4j
@Aspect
@Component
public class Aop {
    @Around("execution(* com.github.fish56.mvc.controller.AopController.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info("this is from Aop");

        // 获得方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println(JSONObject.toJSONString(args));

        Object object = joinPoint.proceed();

        log.info("end Aop");
        return object;
    }
}
