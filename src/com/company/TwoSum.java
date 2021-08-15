package com.company;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if(j != i && target - nums[i] == nums[j]) {
                        if(!list.contains(i)) list.add(i);
                        if(!list.contains(j)) list.add(j);
                    }
                }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        for (int nn:result)
            System.out.println(nn);
    }
}
