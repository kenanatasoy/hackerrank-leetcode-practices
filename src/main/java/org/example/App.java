package org.example;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Hello world!
 *
 */

public class App {

    static String str = "code";

    private static String strMethod(String... strArr){
        String stringToReturn = "";
        for (String s : strArr) {
            if (s.contains(str)){
                stringToReturn = s;
                break;
            }
        }
        return stringToReturn;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[5];


        boolean isBlank = false;

        for (int i = 0; i < 5 || isBlank;){

            if( (strArr[i] = sc.nextLine()).isBlank() ){
                out.println("please don't input blank line");
                isBlank = true;
            }

            else {
                i++;
                isBlank = false;
            }

        }

        sc.close();

        if(!strMethod(strArr).equals("")){
            out.println("Tanımlı value yu içeren String deger: " + strMethod(strArr));
        }


    }
}
