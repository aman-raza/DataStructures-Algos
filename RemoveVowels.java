package com.aman.data_structures;

import java.util.Set;

public class RemoveVowels {

    public static void main(String[] args) {
        System.out.println(removeVowels("ice cream"));
    }

    public static String removeVowels(String str){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] chars = str.toCharArray();
        for(Character ch : chars){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
