package com.example.springin28minutes.basic.sorting;

import com.example.springin28minutes.basic.SortImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortImpl implements SortImpl {

    public int[] sort(int[] numbers){
        // implement Quick sort

        return numbers;
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
