package org.example.practices;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        if(s.length() == 1)
            return 0;

        outer:
        for(int i = 0; i < s.length(); i++){

            for(int j = 0; j < s.length(); j++){

                if(i == j)
                    continue;

                if(s.charAt(i) == s.charAt(j)){
                    continue outer;
                }
            }

            return i;
        }

        return -1;
    }
}
