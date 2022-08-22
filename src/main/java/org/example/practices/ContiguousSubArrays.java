package org.example.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ContiguousSubArrays {

//    TODO:

    public void contiguousSubArrays() throws IOException {

        BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bF.readLine());
        int[] A = Stream.of(bF.readLine().split(" "))
                .map(Integer::valueOf)
                .mapToInt(i -> i)
                .toArray();

        int subArrayCount = 0;

        for(int i = 0; i < A.length; i++){

            int total = 0;
            for(int j = i; j < A.length; j++){

                total += A[j];

                if(total < 0)
                    subArrayCount++;

            }

        }

        System.out.println(subArrayCount);

    }
}
