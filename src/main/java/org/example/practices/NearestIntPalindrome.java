package org.example.practices;

import static java.lang.System.out;

public class NearestIntPalindrome {

    public static void main(String[] args) {
        out.println(nearestIntPalindrome(678565));
    }

    private static int nearestIntPalindrome(int input){

        if(isPalindromeInteger(input))
            return input;

        long i = input + 1, j = input - 1;

        while(true){
            if(j < Integer.MIN_VALUE || j > Integer.MAX_VALUE){ // edge cases
                if (i < Integer.MIN_VALUE || i > Integer.MAX_VALUE){
                    break;
                }
                if (isPalindromeInteger((int)i))
                    return (int)i;
            }

            if (isPalindromeInteger((int)j)) {
                return (int) j;
            }

            i++;
            j--;
        }
        throw new RuntimeException("There is no nearest int palindrome. The number exceeds int limits.");
    }


    private static boolean isPalindromeInteger(int input) { // for => byte, short, int, long

        long reversed = 0;

        while(input != 0){

            reversed = reversed * 10 +  input % 10;
            input /= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                throw new RuntimeException("reversed integer exceeds int limits"); //TODO: there needs to be some fix here
            }
        }

        return input == reversed;

    }

}
