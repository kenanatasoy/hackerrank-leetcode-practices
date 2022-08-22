package org.example.practices;

import static java.lang.System.out;

public class FibonacciIterative {

    public static void main(String[] args) {

        //0 1 1 2 3 5
        //1 2 3 4 5 6

        int number = 6;

        fibonacciNumberIterative(number);


    }


    private static void fibonacciNumberIterative(int number){

        // a b k
        // 5 8 13
        long k, a = 0, b = 1;
        k = 0;

        out.print("0 1 ");

        while(k < number){ //TODO:
            k = a + b;
            out.print(k + " ");
            a = b;
            b = k;
        }

    }
}
