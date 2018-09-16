package com.akashgrade.Troy.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket troyAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.akashgrade.Troy.controllers"))
				.paths(regex("/.*"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		
		ApiInfo apiInfo =  new ApiInfo("Troy", "Real Time monitoring", "1.o", "Terms of service", new springfox.documentation.service.Contact("Akash Grade", "http:dsadas/dasda", "akashgrade90@gmail.com"), "Open", "Open");
	
		return apiInfo;
	}
}
