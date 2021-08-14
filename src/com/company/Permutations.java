package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();

//        if (nums.length <= 1) {
//            return 1;
//        }
//        else {
        int length = IntStream.rangeClosed(2, nums.length).reduce((x, y) -> x * y).getAsInt();
//        }

        for (int i = 0; i < length; i++) {

        }




    }
}
