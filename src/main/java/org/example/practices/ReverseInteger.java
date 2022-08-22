package org.example.practices;

public class ReverseInteger {
    public int reverse(int x) {

        long reversed = 0;

        while( x != 0){

            reversed = reversed * 10 + x % 10;

            x /= 10;

            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
                return 0;

        }

        return (int) reversed;
    }

}
