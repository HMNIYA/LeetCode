package com.company;

import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5}; //1,1,2,2,3,5
        int[] result = new int[nums.length];
        int a = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            a ^= nums[i-1];
            if(a != 0 && nums[i-1] != nums[i]){
                result[i-1] = a;
                a = 0;
            }
        }

        for(int q : result) System.out.println(q); // return a


    }
}
