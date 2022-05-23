package org.example.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaIntegerTypes {

    private void javaIntegerTypes() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        byte T = Byte.parseByte(reader.readLine());

        for(byte i = 0; i < T; i++){

            var value = new BigInteger(reader.readLine());

            if(value.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && value.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0)
                System.out.printf("%d can be fitted in:\n* byte\n* short\n* int\n* long\n", value);

            else if(value.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && value.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0)
                System.out.printf("%d can be fitted in:\n* short\n* int\n* long\n", value);

            else if(value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0)
                System.out.printf("%d can be fitted in:\n* int\n* long\n", value);

            else if(value.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && value.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0)
                System.out.printf("%d can be fitted in:\n* long\n", value);

            else
                System.out.printf("%d can't be fitted anywhere.\n", value);

        }

        reader.close();
    }
}
