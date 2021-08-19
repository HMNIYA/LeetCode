package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity2 {
    public static int[] sortArrayByParity(int[] nums) {
        //int[] result = list.stream().mapToInt(i -> i).toArray();
        int evenNum = 0;
        int oddNum = 0;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int num : nums){
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 != 0) {
                result[i] = odd.get(oddNum);
                oddNum++;
            }
            else {
                result[i] = even.get(evenNum);
                evenNum++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}

//  Output: [4,5,2,7]