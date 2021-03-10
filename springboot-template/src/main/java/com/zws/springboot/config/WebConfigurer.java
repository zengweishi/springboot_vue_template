package com.zws.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

/**
 * @Author: weishi.zeng
 * @Date: 2021/3/10 11:36
 * @Description:
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Bean
    public FilterRegistrationBean indexFilterRegistrationBean() {
        FilterRegistrationBean filterFilterRegistrationBean = new FilterRegistrationBean(new IndexFilter());
        filterFilterRegistrationBean.addUrlPatterns("*");
        return filterFilterRegistrationBean;
    }
}
