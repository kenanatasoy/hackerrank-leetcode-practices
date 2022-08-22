package org.example.practices;

import java.util.*;

import static java.lang.System.*;

public class JavaDequeue {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();

        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxUniqueNums = 0;

        for (int i = 0; i < n; i++) {

            if (i >= m) {
                int old = deque.remove();
                if (map.get(old) == 1) {
                    map.remove(old);
                }
                else {
                    map.put(old, map.get(old) - 1);
                }
            }

            int num = sc.nextInt();
            deque.add(num);
            map.merge(num, 1, Integer::sum);

            maxUniqueNums = Math.max(maxUniqueNums, map.size());

            if (maxUniqueNums == m) {
                break;
            }
        }

        sc.close();
        out.println(maxUniqueNums);
    }

}



