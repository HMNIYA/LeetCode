package com.company;


public class ReverseWordsInAString3 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        String space = " ";
        for(String word : words) {
            char[] array = word.toCharArray();
            for (int i = array.length - 1; i >= 0; i--) {
                result = result + array[i];
            }
            result += space;
        }
        StringBuffer finalResult= new StringBuffer(result);
        finalResult.deleteCharAt(finalResult.length()-1);
        return String.valueOf(finalResult);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseWords(s);
        System.out.println(result);
    }
}