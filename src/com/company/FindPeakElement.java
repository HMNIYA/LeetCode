package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int maxPeakVal = nums[0];
        int maxPeakIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (nums[i] > maxPeakVal) {
                    maxPeakVal = nums[i];
                    maxPeakIdx = i;
                }
            }
        }

        //return maxPeakIdx;
    }
}