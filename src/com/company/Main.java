package com.company;

import com.company.problem.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MostFrequentItem mostFrequentItem = new MostFrequentItem(new int[]{1, 10, 3, 3, 4, 4, 10, 1, 9, 10});
        System.out.println(mostFrequentItem.exec());

        CommonElements commonElements = new CommonElements(new int[]{1, 2, 4, 5}, new int[]{1, 2, 3, 4, 6, 7});
        System.out.println(Arrays.toString(commonElements.exec()));

        IsRotation isRotation = new IsRotation(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{4,5,6,7,1,2,3});
        System.out.println(isRotation.exec());

        NonRepeatingChar nonRepeatingChar = new NonRepeatingChar("axxbcbc");
        System.out.println(nonRepeatingChar.exec());

        ReverseInt32 reverseInt32 = new ReverseInt32(901000);
        System.out.println(reverseInt32.exec());

        IsPalindromeNum isPalindromeNum = new IsPalindromeNum(121);
        System.out.println(isPalindromeNum.exec());

        RemoveDuplicates removeDuplicates = new RemoveDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(removeDuplicates.exec());
    }
}
