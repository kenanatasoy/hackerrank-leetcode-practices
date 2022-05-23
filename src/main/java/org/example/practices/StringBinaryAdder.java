package org.example.practices;

import java.util.Scanner;

public class StringBinaryAdder {

    public String addTwoNumericStrings(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first string num: ");
        String a = sc.nextLine();
        System.out.println("Type the second string num: ");
        String b = sc.nextLine();
        sc.close();

        StringBuilder sum = new StringBuilder();

        boolean carry = false;
        int i = a.length() > b.length() ? a.length() - 1 : b.length() - 1;
        int diff = Math.abs(a.length() - b.length());
        int conditionalIndex1;
        int conditionalIndex2;


        for (; i >= diff; i--) {

            conditionalIndex1 = a.length() > b.length() ? i : i - diff;
            conditionalIndex2 = b.length() > a.length() ? i : i - diff;

            if (a.charAt(conditionalIndex1) == '0' && b.charAt(conditionalIndex2) == '0' && !carry) {
                sum.insert(0, '0');
                carry = false;
                continue;
            }

            if (a.charAt(conditionalIndex1) == '0' && b.charAt(conditionalIndex2) == '0' && carry) {
                sum.insert(0, '1');
                carry = false;
                continue;
            }

            if (((a.charAt(conditionalIndex1) == '1' && b.charAt(conditionalIndex2) == '0') || (a.charAt(conditionalIndex1) == '0' && b.charAt(conditionalIndex2) == '1')) && !carry) {
                sum.insert(0, '1');
                carry = false;
                continue;
            }

            if (((a.charAt(conditionalIndex1) == '1' && b.charAt(conditionalIndex2) == '0') || (a.charAt(conditionalIndex1) == '0' && b.charAt(conditionalIndex2) == '1')) && carry) {
                sum.insert(0, '0');
                carry = true;
                continue;
            }

            if (a.charAt(conditionalIndex1) == '1' && b.charAt(conditionalIndex2) == '1' && !carry) {
                sum.insert(0, '0');
                carry = true;
                continue;
            }

            if (a.charAt(conditionalIndex1) == '1' && b.charAt(conditionalIndex2) == '1' && carry) {
                sum.insert(0, '1');
                carry = true;
            }

        }

        if (a.length() == b.length()) {
            if (carry) {
                sum.insert(0, '1');
                carry = false;
            }
            return sum.toString();
        }

        if (a.length() > b.length()){

            for (i = a.length() - b.length() - 1; i >= 0; i--){

                if (a.charAt(i) == '1' && carry){
                    sum.insert(0, '0');
                    carry = true;
                    continue;
                }

                if ( (a.charAt(i) == '0' && carry) || (a.charAt(i) == '1' && !carry) ){
                    sum.insert(0,'1');
                    carry = false;
                    continue;
                }

                if (a.charAt(i) == '0' && !carry){
                    sum.insert(0, '0');
                }
            }

            if (i == -1){
                if (carry){
                    sum.insert(0,'1');
                    carry = false;
                    return sum.toString();
                }
                return sum.toString();
            }

        }

        if (a.length() < b.length()){

            for (i = b.length() - a.length() - 1; i >= 0; i--){

                if (b.charAt(i) == '1' && carry){
                    sum.insert(0, '0');
                    carry = true;
                    continue;
                }

                if ( (b.charAt(i) == '0' && carry) || (b.charAt(i) == '1' && !carry) ){
                    sum.insert(0,'1');
                    carry = false;
                    continue;
                }

                if (b.charAt(i) == '0' && !carry){
                    sum.insert(0, '0');
                }
            }

            if (i == -1){
                if (carry){
                    sum.insert(0,'1');
                    carry = false;
                    return sum.toString();
                }
                return sum.toString();
            }

        }

        return sum.toString();

    }
}
