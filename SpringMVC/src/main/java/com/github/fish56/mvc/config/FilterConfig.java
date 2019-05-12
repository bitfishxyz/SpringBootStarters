package com.github.fish56.mvc.config;

import com.github.fish56.mvc.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置filter
 */
@Component
public class FilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        LogFilter logFilter = new LogFilter();
        filterRegistrationBean.setFilter(logFilter);

        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/");
        filterRegistrationBean.setUrlPatterns(urlPatterns);

        return filterRegistrationBean;
    }
}
