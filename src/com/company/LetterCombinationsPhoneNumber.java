package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
//        if (nums == null || nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> firstlist = new ArrayList<>();
        findSubSet(nums, 0, firstlist, list);
        System.out.println(list);
    }
    public static void findSubSet(int[] nums, int i, ArrayList<Integer> firstList, List<List<Integer>> list){
        list.add(new ArrayList<>(firstList));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            firstList.add(nums[j]);
            findSubSet(nums, j + 1, firstList, list);
            firstList.remove(firstList.size() - 1);
        }
    }
}
