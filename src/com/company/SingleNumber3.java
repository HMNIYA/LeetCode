package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        Set<Integer> set = new HashSet();
        for(int num : nums){ //Set: 3,5
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                set.remove(num);
            }
        }
        int[] result = new int[2];
        int i = 0;
        for(int num : set){
            result[i] = num;
            i++;
        }
        //return result;
    }
}