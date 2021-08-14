package com.company;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,4,7,5,2};
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            runningSum[i] = sum;
        }
        //return runningSum;
    }
}
