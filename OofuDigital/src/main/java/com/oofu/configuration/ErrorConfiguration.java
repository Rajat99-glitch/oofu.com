package com.oofu.configuration;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class ErrorConfiguration {

    @Bean
    public ErrorViewResolver customErrorViewResolver() {
        return (request, status, model) -> new ModelAndView(); // Return an empty ModelAndView to disable default view name generation
    }
}
