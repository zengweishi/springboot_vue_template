package com.zws.springboot.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: weishi.zeng
 * @Date: 2021/3/10 11:35
 * @Description:跨域配置
 */
public class IndexFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String[] allowDomain = {"http://localhost:8080"};
        Set<String> allowedOrigins = new HashSet<String>(Arrays.asList(allowDomain));
        String originHeader = ((HttpServletRequest) servletRequest).getHeader("Origin");
        if (allowedOrigins.contains(originHeader)) {
            response.setHeader("Access-Control-Allow-Origin",originHeader);
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            response.setHeader("Access-Control-Allow-Credentials", "true");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
