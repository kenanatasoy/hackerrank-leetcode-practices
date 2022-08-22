package org.example.practices;

import static java.lang.System.out;

public class FibonacciRecursiveWithMemo {

    private static long[] fibonacciCache;

    public static void main(String[] args) {

        //0 1 1 2 3 5
        //1 2 3 4 5 6

        int number = 30;

        fibonacciCache = new long[number];

        for (int i = 1; i <= number; i++) {
            out.print(fibonacciNumberRecursive(i) + " ");
        }


    }

    private static long fibonacciNumberRecursive(int number){

        if(number <= 0)
            throw new RuntimeException();
        if(number == 1)
            return 0;
        if(number == 2)
            return 1;

        if(fibonacciCache[number - 1] != 0){
            return fibonacciCache[number - 1];
        }

        fibonacciCache[number - 1] = fibonacciNumberRecursive(number - 1) + fibonacciNumberRecursive(number - 2);

        return fibonacciCache[number - 1];
    }



}
