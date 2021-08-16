package com.company;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        for(int i = 0; i < s.length(); i++)
            if(cyclicLeftShift(s, i).equals(goal)) System.out.println("true");//return true;
        //return false;
    }
    public static String cyclicLeftShift(String s, int k){
        k = k%s.length();
        return s.substring(k) + s.substring(0, k);
    }
}