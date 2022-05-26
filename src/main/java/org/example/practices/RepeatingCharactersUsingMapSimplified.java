package org.example.practices;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingCharactersUsingMapSimplified {

    public String repeatingCharactersUsingMapSimplified(String str){

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++){

            if (charCountMap.containsKey(str.charAt(i))){
                charCountMap.replace(str.charAt(i), charCountMap.get(str.charAt(i)) + 1);
            }

            else
                charCountMap.put(str.charAt(i), 1);

        }

        StringBuilder strBuilder = new StringBuilder();
        charCountMap.forEach((key, value) -> {
            if (value > 1)
                strBuilder.append(key);
        });

        return strBuilder.toString();
    }
}
