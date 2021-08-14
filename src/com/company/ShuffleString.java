package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShuffleString {
    public static void main(String[] args) {
        String s ="codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = "";
        Character[] sChar = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], sChar[i]);
        }
        for(Character ch : map.values()){
            result += ch;
        }
        //return result;
    }
}
