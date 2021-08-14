package com.company;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] nums = {1,4,7,5,2};
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        //return ans;
    }
}
