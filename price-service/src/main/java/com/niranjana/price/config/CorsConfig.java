package com.niranjana.price.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

	@Value("${frontend.url}")
	private String frontendUrl;

	@Value("${frontend.url.k8s:#{null}}")
	private String frontendUrlK8s;

	@Bean
	public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            List<String> origins = new ArrayList<>();
	            origins.add(frontendUrl);
	            if (frontendUrlK8s != null) {
	                origins.add(frontendUrlK8s);
	            }
	            registry.addMapping("/**")
	                    .allowedOrigins(origins.toArray(new String[0]))
	                    .allowedMethods("*")
	                    .allowedHeaders("*");
	        }
	    };
	}
}