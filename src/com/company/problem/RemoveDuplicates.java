package com.company.problem;

import java.util.HashMap;

public class RemoveDuplicates {
    private int[] nums;
    public RemoveDuplicates(int[] nums) {
        this.nums = nums;
    }

    public int exec() {
        if(nums.length<=1){
            return nums.length;
        }
        int count = 1;
        int i= 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[count] = nums[j];
                count++;
                i = j;
            }
        }
        return count;
    }

    public int execBad() {
        int pointer = 0;
        HashMap<Integer, Boolean> occurMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (occurMap.getOrDefault(nums[i], false)) {
                if (i + 1 < nums.length && nums[i] != nums[i+1]) {
                    nums[pointer] = nums[i+1];
                    occurMap.put(nums[pointer], true);
                    pointer++;
                }
            } else {
                occurMap.put(nums[i], true);
                pointer++;
            }
        }

        return pointer;
    }
}
