package com.ps.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ps"))
				.paths(PathSelectors.any())
				.build();
			
				
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("Swagger2 DEMO in Spring Boot")
				.description("It's a DEMO.")
				.termsOfServiceUrl("http://termsofService.com")
				.contact("jinghe.zhang@veritas.com")
				.version("1.0")
				.build();
	}
}