package com.company;

import java.util.*;

public class FindAllDuplicatesArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                list.add(nums[i]);
                System.out.println(nums[i]);//return nums[i];
            }
        }
        //return 0;
    }
}
