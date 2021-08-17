package com.company;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int left, right = 0;
        right = s.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }

        for (char c : s)
            System.out.print(c);
    }
}