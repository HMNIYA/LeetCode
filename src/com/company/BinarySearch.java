package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 3;
        int count = 0;

        for(int elem : nums){
            if(elem == target) System.out.println(count);//return count;
            count++;
        }
        //return -1;


    }
}
