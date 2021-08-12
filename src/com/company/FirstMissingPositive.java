package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        int max = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) {
            if(i<0) continue;
            hs.add(i);
            max = Math.max(max, i);
        }
        System.out.println(hs);
        for(int i = 1;i<=max;i++) {
            if(!hs.contains(i)) System.out.println(i);//return i;
        }

        //return max+1;
    }
}
