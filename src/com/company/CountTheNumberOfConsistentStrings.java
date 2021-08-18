package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        char[] allowedChar = allowed.toCharArray();
        int totalCount = 0;
        for (String word : words) {
            char[] wordChar = word.toCharArray();
            Set set = new HashSet();
            for (int i = 0; i < wordChar.length; i++) {
                set.add(wordChar[i]);
            }
            for(char symbol : allowedChar){
                set.remove(symbol);
            }
            if(set.size() == 0 ) totalCount++;
        }
        return totalCount;
    }



    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        //countConsistentStrings(allowed, words);
        System.out.println(countConsistentStrings(allowed, words));
    }
}
