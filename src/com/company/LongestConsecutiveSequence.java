package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
//        int length = nums.length;
//
//        List<Integer> list = new ArrayList<>();
//        Integer count = 1;
//        int max = Arrays.stream(nums).max().getAsInt();
//        Set<Integer> set = new HashSet<Integer>();
//
//        //добавление в сорт коллекцию
//        for(int i : nums) {
//            set.add(i);
//        }
//
//        //создание листа для обращения по индексу к сорт коллекции
//        List<Integer> newList = new ArrayList<>(set);
//
//        for (int i = 1; i < length-1; i++) {
//            if(newList.get(i).equals(newList.get(i-1)+1)) {
//                count++;
//                if(newList.get(i).equals(max)) list.add(count);
//                continue;
//            }
//
//            list.add(count);
//            count = 1;
//        }
//
//        System.out.println(list);

        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        System.out.println(longestStreak);
    }
}
