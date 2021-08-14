package com.company;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int q = 0;
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length-n; i++) {
            nums2[q] = nums[i];
            nums2[q+1] = nums[i+n];
            q+=2;
        }
        //return nums2;
    }
}