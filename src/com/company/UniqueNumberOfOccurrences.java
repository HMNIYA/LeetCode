package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> fullSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]) count++;
            }
            set.add(count);
        }
        if(set.size() == fullSet.size()) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }
}
