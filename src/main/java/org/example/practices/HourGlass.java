package org.example.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class HourGlass {

    public void hourGlass() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        List<Integer> integerList = new ArrayList<>();

        for(int a = 0; a < 4; a++){

            for(int b = 0; b < 4; b++){

                int sum = 0;
                for(int i = a; i < a + 3; i++){

                    for(int j = b; j < b + 3; j++){

                        if( i == a + 1 && j == b )
                            continue;
                        if (i == a + 1 && j == b + 2)
                            break;
                        sum += arr.get(i).get(j);
                    }

                }

                integerList.add(sum);
            }
        }

        Integer maxSum = Collections.max(integerList);

        out.println(maxSum);

    }

}
