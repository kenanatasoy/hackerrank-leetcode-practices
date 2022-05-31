package org.example.practices;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoi {

    public static int myAtoi(String s) {

        s = s.trim();
        s = s.replaceAll("\\D+$", "");

        if (Pattern.matches("^[+-]{2,}[0-9]+.*", s))
            return 0;

        if (Pattern.matches("^[^0-9+-]+[+-]?[0-9]+", s))
            return 0;

        Pattern pattern = Pattern.compile("^[+-]?[0-9]+(?=([^0-9]+.*))?");

        Matcher matcher = pattern.matcher(s);
        if(matcher.find()){

            String matched = matcher.group();

            BigInteger bigInteger = new BigInteger(matched);

            if( bigInteger.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 &&
                    bigInteger.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 )
                return bigInteger.intValue();

            else if( bigInteger.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 )
                return Integer.MAX_VALUE;

            else
                return Integer.MIN_VALUE;
        }

        return 0;


    }


    public static void main(String[] args) {
        System.out.println(myAtoi("3.14159"));
    }


}
