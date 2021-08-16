package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] words = s.split(" ");
        String result = "";
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++){
            char[] wordChar = words[i].toCharArray();
            map.put(Integer.parseInt(String.valueOf(wordChar[wordChar.length-1])), words[i].replaceFirst(".$",""));
        }
        List<String> list = new ArrayList<String>(map.values());
        for(int i = 0; i < words.length; i++){
            if(i < words.length-1) result += list.get(i) + " ";
            else result += list.get(i);
        }
        System.out.println(result);
    }
}

//        Output: "This is a sentence"