package com.company;

import com.company.problem.CommonElements;
import com.company.problem.IsRotation;
import com.company.problem.MostFrequentItem;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MostFrequentItem mostFrequentItem = new MostFrequentItem(new int[]{1, 10, 3, 3, 4, 4, 10, 1, 9, 10});
        System.out.println(mostFrequentItem.exec());

        CommonElements commonElements = new CommonElements(new int[]{1, 2, 4, 5}, new int[]{1, 2, 3, 4, 6, 7});
        System.out.println(Arrays.toString(commonElements.exec()));

        IsRotation isRotation = new IsRotation(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{4,5,6,7,1,2,3});
        System.out.println(isRotation.exec());
    }
}
