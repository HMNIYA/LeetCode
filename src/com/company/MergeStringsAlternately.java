package com.company;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        char[] word3 = new char[word1.length() + word2.length()];
        String result = "";
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        int count = 0;
        for (int i = 0; i < word3.length; i+=2) {
                if (count >= word1.length() && count < word2.length()) {
                    for (int j = count; j < word2.length(); j++) {
                        word3[i] = word2Char[count];
                        count++;
                        i++;
                    }
                }
                if (count >= word2.length() && count < word1.length()) {
                    for (int j = count; j < word1.length(); j++) {
                        word3[i] = word1Char[count];
                        count++;
                        i++;
                    }
                }
                else if(count < word2.length() && count < word1.length()) {
                    word3[i] = word1Char[count];
                    word3[i + 1] = word2Char[count];
                }
                count++;
        }
        result = String.valueOf(word3);
        System.out.println(result);//return result;
    }
}

//  Output: "apbqcr"