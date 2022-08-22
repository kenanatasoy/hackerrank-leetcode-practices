package org.example.practices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases-- > 0) {
            String line = sc.nextLine();

            boolean matchFound = false;

            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(0));
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("None");
            }
        }

        sc.close();
    }
}
