package org.example.practices;

import java.util.*;

import static java.lang.System.*;

public class PrintUniquePairsCountWithSet {

    public void printUniquePairsCount(){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        List<String> stringList = new LinkedList<>();
        Set<String> stringSet = new LinkedHashSet<>(stringList);

        for(int i = 0; i < T; i++){
            stringList.add(sc.nextLine());
        }

        sc.close();

        int uniquePairCount = 0;

        for (String s : stringList) {

            if (stringSet.add(s)) {
                uniquePairCount++;
            }
            out.println(uniquePairCount);

        }


    }

}
