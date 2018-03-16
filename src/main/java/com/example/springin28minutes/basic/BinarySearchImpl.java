package com.example.springin28minutes.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Inject
    @Qualifier("quick")
    SortImpl quickSortImpl;

    public int binarySearch(int[] numbers, int numberTo){
        // implement the sorting logic
        // search for the number
        // return it

        //BubbleSortImpl bubbleSort = new BubbleSortImpl();
        int[] sortedNumbers = quickSortImpl.sort(numbers);
        logger.info("The Algorithm being used is : "+ quickSortImpl.toString());

        return 3;
    }

    @PostConstruct
    void PostConstruct(){
        logger.info("Inside the Post Construct of BinarySearchImpl!!");
    }

    @PreDestroy
    void preDestroy(){
        logger.info("Inside the Pre Destroy of BinarySearchImpl!!");
    }

}
