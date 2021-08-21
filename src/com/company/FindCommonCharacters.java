package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static List<String> commonChars(String[] words) {
        int[] table = new int[26];
        Arrays.fill(table, Integer.MAX_VALUE);
        for(String word : words) {
            int[] freq = new int[26];
            for(char c : word.toCharArray()) freq[c - 'a']++;
            for(int i =  0; i < table.length; i++) {
                table[i] = Math.min(table[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < table.length; i++) {
            while(table[i] > 0) {
                ans.add((char) ('a' + i) + "");
                table[i]--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String[] list = {"bella","label","roller"};
        System.out.println(commonChars(list));
    }
}