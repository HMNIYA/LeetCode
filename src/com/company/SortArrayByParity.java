package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num % 2 == 0) {
                list.add(num);
            }
        }
        for(int num : nums){
            if(num % 2 != 0) list.add(num);
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}

//  Output: [2,4,3,1]
