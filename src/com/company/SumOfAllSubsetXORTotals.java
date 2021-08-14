package com.company;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
        int[] nums = {1, 3};
//        int bits = 0;
//
//
//        for (int i = 0; i < nums.length; ++i)
//            bits |= nums[i];
//
//        int result = bits * (int)Math.pow(2, nums.length-1);
        int sum = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++)
        {

            for(int j = i; j < nums.length; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    sum |= nums[k];

                }
            }

        }
        result = sum * (int)Math.pow(2, nums.length-1);
        System.out.println(result);
        //return result;
    }
}
//Output: 6