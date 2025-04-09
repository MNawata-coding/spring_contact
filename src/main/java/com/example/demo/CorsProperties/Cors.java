package com.example.demo.CorsProperties;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
                .allowedOrigins(
                    "http://localhost:5173/",
                                "http://react-portfolio-suica1229.s3-website-ap-northeast-1.amazonaws.com",
                                "https://ne1z4vlk16.execute-api.ap-northeast-1.amazonaws.com",
                                "https://react-portfolio-suica1229.s3.ap-northeast-1.amazonaws.com")
                .allowedMethods("POST","GET","DELETE", "PUT")
                .allowedHeaders("Content-Type","X-Amz-Date","Authorization","X-Api-Key","X-Amz-Security-Token")
                .allowCredentials(true);
    }
}
