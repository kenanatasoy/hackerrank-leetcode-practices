package org.example.practices;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        boolean carry = true;

        for (int i = digits.length - 1; i >= 0; i--){

            if(digits[i] == 9 && carry){
                digits[i] = 0;
                carry = true;
                continue;
            }

            if(digits[i] != 9 && carry){
                digits[i]++;
                carry = false;
            }

        }

        if ( carry ){

            int[] digits1 = new int[digits.length + 1];
            digits1[0] = 1;
            System.arraycopy(digits, 0, digits1, 1, digits1.length - 1);

            return digits1;
        }

        else {
            return digits;
        }
    }
}
