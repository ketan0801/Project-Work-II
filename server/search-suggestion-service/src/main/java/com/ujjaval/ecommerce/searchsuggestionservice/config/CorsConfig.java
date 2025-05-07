package com.ujjaval.ecommerce.searchsuggestionservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer
{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://shoppers-ecom-app.herokuapp.com", "http://localhost:3000") // Add localhost for development
                .allowedMethods("GET", "POST", "OPTIONS", "DELETE")
                .allowCredentials(true);  // Allows cookies if needed
    }

}
