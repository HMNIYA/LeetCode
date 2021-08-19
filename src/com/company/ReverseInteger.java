package com.company;

import java.util.Arrays;

public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        int x = 1234567898;
        System.out.println(reverse(x));
    }
}