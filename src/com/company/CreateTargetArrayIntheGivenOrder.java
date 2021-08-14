package com.company;

import java.util.LinkedList;
import java.util.List;

public class CreateTargetArrayIntheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        List<Integer> linkedlist = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            linkedlist.add(index[i], nums[i]);
        }
        int[] result = linkedlist.stream().mapToInt(i->i).toArray();
        //return result;
    }
}
