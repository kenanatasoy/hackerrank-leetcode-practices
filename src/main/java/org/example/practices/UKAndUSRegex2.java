package org.example.practices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class UKAndUSRegex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //TODO: to be fixed

        sc.nextLine();

        StringBuilder sBuilder = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sBuilder.append(sc.nextLine());
        }

        String stringToMatch = sBuilder.toString();

        int T = sc.nextInt();

        String[] strArr = new String[T];

        for(int i = 0; i < T; i++){
            strArr[i] = sc.next();
        }

        for(int i = 0; i < T; i++){

            long count = 0L;

            if(Pattern.matches(".*ou?r.*", stringToMatch)){

                int index = strArr[i].indexOf("u");

                if(index == -1){

                    Pattern pattern = Pattern.compile(strArr[i]);
                    Matcher matcher = pattern.matcher(stringToMatch);

                    count = matcher.results().count();
                    out.println(count);
                }

                else {
                    StringBuilder strBuilder = new StringBuilder(strArr[i]);
                    //String newStringToMatch = strArr[i].substring(0, index + 1) + "?" + strArr[i].substring(index + 2);
                    strBuilder.insert(index + 1, "?");

                    Pattern pattern = Pattern.compile(strBuilder.toString());
                    Matcher matcher = pattern.matcher(stringToMatch);

                    count = matcher.results().count();

                    out.println(count);

                }

            }

            else {

                out.println(0);
            }




        }

    }
}