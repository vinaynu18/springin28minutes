package com.example.springin28minutes;

import com.example.springin28minutes.basic.BinarySearchImpl;
import com.example.springin28minutes.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class Springin28minutesPropertiesApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springin28minutesPropertiesApplication.class);){

			SomeExternalService someService = applicationContext.getBean(SomeExternalService.class);
			System.out.println(someService.returnServiceURL());

		}
	}
}