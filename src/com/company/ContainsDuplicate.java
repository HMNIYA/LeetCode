package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        Arrays.sort(nums);
        boolean count = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                count = true;
                System.out.println("true"); // return true
                break;
            }
        }
        System.out.println("false"); //return false
    }
}
