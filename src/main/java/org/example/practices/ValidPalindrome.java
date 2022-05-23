package org.example.practices;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--){

            if(s.charAt(i) == s.charAt(j))
                continue;

            return false;

        }


        return true;

    }
}
