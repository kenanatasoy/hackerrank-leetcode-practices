package org.example.practices;

public class IsPalindromeString {

    private static boolean isPalindromeString(int input) { //for => String only!!

        String inputStr = String.valueOf(input);

        //"ecece" => Palindrome
        for (int i = 0, j = inputStr.length() - 1; i < inputStr.length() / 2; i++, j--) {

            if (inputStr.charAt(i) == inputStr.charAt(j)){

            }
            else {
                return false;
            }
        }

        return true;
    }

}
