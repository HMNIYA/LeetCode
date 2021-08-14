package com.company;

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 1};
        int a = 0;
        for(int num : nums)
            a ^= num;
        System.out.println(a); // return a
    }
}
