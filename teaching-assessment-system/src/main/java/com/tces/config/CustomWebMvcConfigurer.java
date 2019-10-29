package com.tces.config;

import com.tces.converter.DateConverter;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        DateConverter dateConverter = new DateConverter();
        registry.addConverter(dateConverter);
    }
}
