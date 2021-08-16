package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondLargestDigitInAString {
    public static void main(String[] args) {
        String s = "ck077";
        String numberOnly= s.replaceAll("[^0-9]", "");
//        if(numberOnly.length() == 0) return -1;
        int[] nums = Arrays.stream(numberOnly.split(""))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int[] originals = set.stream().mapToInt(Number::intValue).toArray();
//        if(originals.length > 1) return originals[originals.length-2];
//        return -1;
    }
}