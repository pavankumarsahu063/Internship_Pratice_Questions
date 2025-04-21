package com.SpringCore.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.SpringCore.javabasedconfig")
public class JavaConfig {
	
	
	@Bean
	public Students students() {
		return new Students();
	}
}
