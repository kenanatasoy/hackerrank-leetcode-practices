package org.example.practices;

import java.util.Arrays;

public class RepeatingCharactersBySorting {

    public String findRepeatingCharactersBySorting(String str){

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length();){

            int j = i + 1;

            int charCount = 1;
            while (str.charAt(i) == str.charAt(j)){
                charCount++;
                j++;
                if (j == str.length())
                    break;
            }

            if (charCount > 1)
                strBuilder.append(str.charAt(i));

            if (j == str.length())
                break;

            i = j;

        }

        return strBuilder.toString();
    }

}
