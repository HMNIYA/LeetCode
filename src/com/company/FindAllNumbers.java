package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllNumbers {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int length = nums.length;

        Set<Integer> set1 = Arrays.stream(nums).boxed().distinct().distinct().collect(Collectors.toSet());

        HashSet<Integer> set2 = CreateSet(length);
        set2.removeAll(set1);

        for (Integer diffElement : set2) {
            System.out.println(diffElement.toString());
        }
    }

    public static HashSet<Integer> CreateSet(int length) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= length; i++) {
            set.add(i);
        }
        return set;
    }
}

