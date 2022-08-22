package org.example.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class CanYouAccess {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int num = Integer.parseInt(br.readLine().trim());
        Object o;

        CanYouAccess.Inner.Private innerPrivate = new CanYouAccess.Inner().new Private();
        out.println(innerPrivate.powerOf2(num));

        o = innerPrivate;

        out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

    }

    static class Inner {
        private class Private {
            private String powerOf2(int num){
                return ( (num&num - 1) == 0 ) ? "power of 2" : "not a power of 2";
            }
        }

    }

}

