package org.example.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class EndOfFile {

    private void endOfFile() throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        AtomicInteger runCount = new AtomicInteger(0);

        rd.lines().forEach(
                line -> {
                    System.out.printf("%d %s\n", runCount.incrementAndGet(), line);
                }
        );

        rd.close();
    }

}
