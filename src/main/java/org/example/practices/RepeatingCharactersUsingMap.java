package org.example.practices;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingCharactersUsingMap {

    public String findRepeatingCharactersUsingMap(String str){

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        int charCount = 0;

        for (int i = 0; i < str.length(); i++){

            charCount = 1;
            if (charCountMap.containsKey(str.charAt(i)))
                continue;
            charCountMap.put(str.charAt(i), charCount);

            for (int j = i + 1; j < str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){
                    charCount++;
                    charCountMap.replace(str.charAt(i), charCount);
                }

            }

        }

        StringBuilder strBuilder = new StringBuilder();

        charCountMap.forEach((key, value) -> {
            if (value > 1)
                strBuilder.append(key);
        });

        //charCountMap.forEach((key, value) -> System.out.println(key + " " + value));

        return strBuilder.toString();
    }
}
