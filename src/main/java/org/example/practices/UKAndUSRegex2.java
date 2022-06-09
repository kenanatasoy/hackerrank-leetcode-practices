package org.example.practices;

import java.util.*;
import java.util.regex.*;

import static java.lang.System.*;

public class UKAndUSRegex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        sc.nextLine();

        String[] strArr1 = new String[n];

        for(int i = 0; i < n; i++) {
            strArr1[i] = sc.nextLine();
        }

        String strToBeTested = String.join(" ", strArr1);

        int t = sc.nextInt();
        sc.nextLine();

        String[] strArr2 = new String[t];

        for(int i = 0; i < t; i++) {
            strArr2[i] = sc.nextLine().replaceAll("our", "or");
        }

        long[] count = new long[t];

        for(int i = 0; i < t; i++){

            Pattern pattern = Pattern.compile("\\b" + strArr2[i] + "\\b");

            Matcher matcher = pattern.matcher(strToBeTested.replaceAll("our", "or"));

            count[i] = matcher.results().count();

        }

        Arrays.stream(count).forEach(out::println);


    }
}
