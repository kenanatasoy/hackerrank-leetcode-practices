package org.example.practices;

import static java.lang.System.*;

public class RecursiveFibonacciWithMemoization {

    private static long[] fibonacciCache;
    private static long[] fibonacciCache2;

    public static void main(String[] args) {

        int n = 50;

        fibonacciCache = new long[n + 1];
        fibonacciCache2 = new long[n + 1];

        printFibNums(5);
        out.println();
        printFibNums2(5);

    }




    private static void printFibNums(int num){

        for (int i = 1; i <= num; i++) {
            out.print(findNthFibNum(i) + " ");
        }

    }

    private static long findNthFibNum(int n){
        //n must be equal to or more than 1
        //if fibonacci starts with 1 1
        if(n <= 0)
            throw new ArithmeticException("please enter an ordinal number!");

        if(n == 1 || n == 2)
            return 1;

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = findNthFibNum(n - 1) + findNthFibNum(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }









    private static void printFibNums2(int num) {

        for (int i = 1; i <= num; i++) {
            out.print(findNthFibNum2(i) + " ");
        }

    }

    private static long findNthFibNum2(int n){
        //n must be equal to or more than 1
        //if fibonacci starts with 0 1
        if(n <= 0)
            throw new ArithmeticException("please enter an ordinal number!");

        if(n == 1)
            return 0;

        if (n == 2)
            return 1;

        if (fibonacciCache2[n] != 0) {
            return fibonacciCache2[n];
        }

        long nthFibonacciNumber = findNthFibNum2(n - 1) + findNthFibNum2(n - 2);
        fibonacciCache2[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
