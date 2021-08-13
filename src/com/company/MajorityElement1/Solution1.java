package com.company.MajorityElement1;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2};
        int max = 0;
        int count = 0;
        Set<Integer> set = Arrays.stream(nums).boxed().distinct().distinct().collect(Collectors.toSet());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>(set);
        int[] qq = new int[set.size()];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < nums.length; j++) {
                //if(list.get(i) == nums[j]) qq[i] += 1;
                if(list.get(i) == nums[j]) {
                    qq[i] += 1;
                    count++;
                    map.put(list.get(i),count);
                }
            }
            count = 0;
        }

        for (int i = 0; i < qq.length-1; i++) {
            max = Math.max(qq[i], qq[i+1]);
        }

        int maxValueInMap=(Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }
}
