package com.example.springin28minutes;

import com.example.springin28minutes.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springin28minutesSpringXMLConfigurationApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin28minutesSpringXMLConfigurationApplication.class);


	public static void main(String[] args) {

		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springin28minutesSpringXMLConfigurationApplication.class);
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");){

			logger.info("Beans loaded -> {}",(Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			logger.info("{}",xmlPersonDAO);
		}

	}
}