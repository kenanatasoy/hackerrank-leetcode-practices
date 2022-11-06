package org.example.practices;

// Reverse Integer: https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public int reverseInteger(int input) { // for => byte, short, int, long

        long reversed = 0;

        while( input != 0){

            reversed = reversed * 10 + input % 10;

            input /= 10;

            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
                throw new RuntimeException("Reversed integer exceeds int limits.");

        }

        return (int) reversed;
    }

}
