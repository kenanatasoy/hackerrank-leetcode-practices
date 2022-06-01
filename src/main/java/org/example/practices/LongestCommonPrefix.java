package org.example.practices;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int smallestStringLength = 0;

        for(int i = 0; i < strs.length; i++){

            if(i == 0) {
                smallestStringLength = strs[i].length();
                continue;
            }

            if( strs[i].length() <= smallestStringLength ){
                smallestStringLength = strs[i].length();
            }

        }

        StringBuilder strBuilder = new StringBuilder();

        outer:
        for(int j = 0; j < smallestStringLength; j++){

            int i;

            for( i = 0; i < strs.length - 1; i++ ){

                if( strs[i].charAt(j) != strs[i+1].charAt(j) )
                    break outer;

            }

            strBuilder.append(strs[i].charAt(j));

        }

        return strBuilder.toString();
    }
}
