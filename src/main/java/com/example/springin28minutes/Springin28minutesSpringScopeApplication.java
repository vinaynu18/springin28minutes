package com.example.springin28minutes;

import com.example.springin28minutes.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Springin28minutesSpringScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin28minutesSpringScopeApplication.class);


	public static void main(String[] args) {

		//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortImpl());
		//        int result = binarySearch.binarySearch(new int[] {1,2,24,36}, 5);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springin28minutesSpringScopeApplication.class);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", personDao);
		logger.info("{}", personDao.getJdbcConnection());
		logger.info("{}", personDao2);
		logger.info("{}", personDao2.getJdbcConnection());
	}
}