package org.example.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StockAnalysis {

//    TODO: find the challenge on hackerrank

    public static void stockAnalysis() throws IOException {

        BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bF.readLine());
        int m = Integer.parseInt(bF.readLine());

        Map<String, String> stringMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] strArr = bF.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                String[] strArr2 = strArr[j].split(":");
                stringMap.put(strArr2[0], strArr2[1]);
            }
        }

        bF.close();

        stringMap.values().forEach(System.out::println);


    }

}
