package org.example.practices;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class SmallestLargestSubstring {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        //TODO: to be fixed
        BiPredicate<Character, Character> isGreater = (a, b) -> a.compareTo(b) > 0;

        Character largestChar = Character.MAX_VALUE;
        Character smallestChar = Character.MIN_VALUE;
        for(int i = 0; i < s.length() - 1; i++){

            largestChar = isGreater.test(s.charAt(i), s.charAt(i + 1)) ? s.charAt(i) : s.charAt(i+1);
            smallestChar = isGreater.test(s.charAt(i), s.charAt(i + 1)) ? s.charAt(i+1) : s.charAt(i);

        }

        int startIndexS = s.indexOf(smallestChar.toString());
        int startIndexL = s.indexOf(largestChar.toString());

        smallest = s.substring( startIndexS, startIndexS + k );
        smallest = s.substring( startIndexL, startIndexL + k );

        return smallest + "\n" + largest;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
