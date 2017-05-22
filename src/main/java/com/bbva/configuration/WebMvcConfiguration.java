package com.bbva.configuration;

import com.bbva.component.RequestTimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jorge on 22/05/17.
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    @Qualifier("requestTimeInterceptor")
    private RequestTimeInterceptor requestTimeInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestTimeInterceptor);
    }
}
