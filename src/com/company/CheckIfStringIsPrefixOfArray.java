package com.company;

public class CheckIfStringIsPrefixOfArray {
    public static void main(String[] args) {
        String s ="aaaaaaa";
        String[] words = {"a","a","a","a","a","a","a"};
        String newWord = "";
        if(words.length > 1) {
            for (int i = 0; i < words.length; i++) {
                newWord += words[i];
                if (newWord.equals(s)) System.out.println("true");//return true;
            }
        }
        else if(s.equals(words[0])) System.out.println("true");//return true;
        System.out.println("false");//return false;
        }
}
