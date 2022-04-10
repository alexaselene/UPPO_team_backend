package com.uppoteam.ecommercemariaharo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.uppoteam.ecommercemariaharo.jwt.config.JwtFilter;

@SpringBootApplication
public class EcommercemariaharoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercemariaharoApplication.class, args);
	}//main
/*
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean =
				new FilterRegistrationBean<JwtFilter>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/usuarios/*");
		//registrationBean.addUrlPatterns("/api/administradores/*");)
		return registrationBean;
	}//jwFilter
	*/
}//class EcommercemariaharoApplication
