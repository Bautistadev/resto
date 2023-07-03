package com.spring.resto.resto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.spring.resto.resto.security.service.UserDefaultService;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.resto.resto"})
@EnableAutoConfiguration

public class RestoApplication  implements CommandLineRunner {

	public static void main(String[] args){
		ConfigurableApplicationContext ctx =  SpringApplication.run(RestoApplication.class, args);
		
	
		
		
	}
	@Autowired
	private ApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		UserDefaultService userDefault = context.getBean(UserDefaultService.class);
		userDefault.createDefaultAdminUser();
		
	}
	
	

}
