package com.company;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int i = 0; i < candies.length; i++) {
            ans.add((candies[i] + extraCandies) >= max);
        }
        //return ans;
    }
}
