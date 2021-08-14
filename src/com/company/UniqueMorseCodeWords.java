package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[] morze = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morzeWord = new String[words.length];

        for (int q = 0; q < words.length; q++) {
            Character[] sChar = words[q].chars().mapToObj(c -> (char)c).toArray(Character[]::new);
            for (int i = 0; i < sChar.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if(sChar[i] == letters[j]) morzeWord[q] += morze[j];
                }
            }
        }
        Set<String> set = new HashSet<>();
        Collections.addAll(set, morzeWord);
        //return set.size();
    }
}
