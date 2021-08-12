package com.company;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        boolean countForLength = false;
        int length = nums.length;
        Arrays.sort(nums);

        if(nums[0] != 0) System.out.println(0);


        for (int i = 1; i < nums.length; i++) {

            if(nums[i-1] != nums[i]-1){
                System.out.println(nums[i]-1); // return nums[i]-1
            }

        }
        System.out.println(length);
    }
}
