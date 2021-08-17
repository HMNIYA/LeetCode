package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            if(nums[i] == 0 || i == nums.length-1){
                list.add(count);
                count = 0;
            }
        }
        int max = Collections.max(list);
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1,0,1,1,1,1,1,0,0};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
