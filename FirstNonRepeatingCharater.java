package com.aman.data_structures;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharater {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("racecars"));
    }

    public static int firstNonRepeatingCharacter(String str){
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char ch : chars){
            characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if(characterFrequencyMap.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}
