package com.github.fish56.mvc.config;

import com.github.fish56.mvc.interceptor.MethodInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置interceptor
 */
@Component
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private MethodInterceptor methodInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(methodInterceptor);
    }
}
