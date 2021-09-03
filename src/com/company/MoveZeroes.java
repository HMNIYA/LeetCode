package com.company;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int j = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                j ++;
            }
        }
    }
}
