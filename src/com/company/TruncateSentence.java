package com.company;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < k; i++) {
            if(i < k-1) result += words[i] + " ";
            else result += words[i];
        }
        //return result;
    }
}
