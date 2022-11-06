package org.example.practices;

import static java.lang.System.out;

public class FibonacciIterative {

    public static void main(String[] args) {

        //0 1 1 2 3 5
        //1 2 3 4 5 6

        int number = 4;

        fibonacciNumberIterative(number);


    }


    private static void fibonacciNumberIterative(int number){

        // a b k
        // 0 1 2
        long k, a = 0, b = 1;

        out.print("0 1 ");

        int i = 0;
        while (i < number - 2) {
            k = a + b;
            out.print(k + " ");
            a = b;
            b = k;
            i++;
        }

//        for (int i = 0; i < number - 2; i++) {
//            k = a + b;
//            out.print(k + " ");
//            a = b;
//            b = k;
//        }

    }
}
