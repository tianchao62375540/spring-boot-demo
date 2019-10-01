package com.demo.config;

import com.demo.intercepter.MyIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: tianchao
 * @Date: 2019/10/1 08:21
 * @Description:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor handlerInterceptor = new MyIntercepter();
        registry.addInterceptor(handlerInterceptor).addPathPatterns("/**");
    }
}
