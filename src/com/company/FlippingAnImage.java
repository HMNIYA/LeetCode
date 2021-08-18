package com.company;

import java.util.Arrays;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] block : image){
            int left, right = 0;
            right = block.length - 1;

            for (left = 0; left < right; left++, right--) {
                int temp = block[left];
                block[left] = block[right];
                block[right] = temp;
            }

            for (int i = 0; i < block.length; i++) {
                if(block[i] == 0) block[i] = 1;
                else if(block[i] == 1) block[i] = 0;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}

//        Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
//        Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//        Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]