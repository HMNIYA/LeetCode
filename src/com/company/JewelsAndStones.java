package com.company;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        char[] jewelsChar = jewels.toCharArray();
        char[] stonesChar = stones.toCharArray();
        int result = 0;

        for(char jewel : jewelsChar){
            for(char stone : stonesChar){
                if(jewel == stone) result++;
            }
        }
        System.out.println(result);
    }
}

//        Output: 3