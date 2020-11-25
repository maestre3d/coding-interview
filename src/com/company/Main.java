package com.company;

import com.company.problem.MostFrequentItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MostFrequentItem mostFrequentItem = new MostFrequentItem(new Integer[]{1, 10, 3, 3, 4, 4, 10, 1, 9, 1});
        System.out.println(mostFrequentItem.exec());
    }
}
