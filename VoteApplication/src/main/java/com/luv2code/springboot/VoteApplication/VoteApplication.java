package com.luv2code.springboot.VoteApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;






@SpringBootApplication
public class VoteApplication extends SpringBootServletInitializer {
	
	
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VoteApplication.class);
	}
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(VoteApplication.class, args);
		
		
	}

	
}
