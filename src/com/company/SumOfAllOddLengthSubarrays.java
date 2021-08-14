package com.company;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5,3};
        int sum = 0;
        int length = nums.length;

        for(int i = 0; i < length; i++)
        {
            for(int j = i; j < length; j += 2)
            {
                for(int k = i; k <= j; k++)
                {
                    sum += nums[k];
                    System.out.println(sum);
                }
            }
        }
//        return sum;
    }
}