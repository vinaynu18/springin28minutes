package com.example.springin28minutes;

import com.example.springin28minutes.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Springin28minutesBasicSpringApplication {

	public static void main(String[] args) {

		//        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortImpl());
		//        int result = binarySearch.binarySearch(new int[] {1,2,24,36}, 5);

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Springin28minutesBasicSpringApplication.class);){



		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[]{1, 2, 24, 36}, 5);
		//System.out.println( new DemoApplication().name);

		System.out.println("returned index is : " + result);

		}
	}
}