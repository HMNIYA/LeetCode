package com.company.MajorityElement1;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2};

        for(int number : nums){
            int count = 0;
            for(int num : nums){
                if(number == num) count++;
            }
            if (count > nums.length/2) System.out.println(number);
            //return number;
        }
    }
}