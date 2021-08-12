package com.company;

import java.util.*;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                System.out.println(nums[i]);//return nums[i];
            }
        }
        //return 0;
    }
}