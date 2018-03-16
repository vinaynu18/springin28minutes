package com.example.springin28minutes.basic.sorting;

import com.example.springin28minutes.basic.SortImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortImpl  implements SortImpl {

    public int[] sort(int[] numbers){

        // implement Bubble sort

        return numbers;
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
