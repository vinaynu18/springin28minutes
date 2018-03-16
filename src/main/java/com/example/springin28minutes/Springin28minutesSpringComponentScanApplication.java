package com.example.springin28minutes;

import com.example.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class Springin28minutesSpringComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin28minutesSpringComponentScanApplication.class);


	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springin28minutesSpringComponentScanApplication.class);
		ComponentDAO componentScanDAO = applicationContext.getBean(ComponentDAO.class);

		logger.info("{}",componentScanDAO);

	}
}