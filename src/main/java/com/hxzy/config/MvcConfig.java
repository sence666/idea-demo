package com.hxzy.config;

import com.hxzy.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {


    @Bean
    public LoginInterceptor loginInterceptor(){
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        return loginInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(this.loginInterceptor()).addPathPatterns("/**");
    }
}
