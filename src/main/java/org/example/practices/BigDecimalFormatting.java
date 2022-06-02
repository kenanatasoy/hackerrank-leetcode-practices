package org.example.practices;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalFormatting {

    public String[] bigDecimalFormatting(String[] s) {

        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String a, String b) {
                BigDecimal bigDecimalA = new BigDecimal(a);
                BigDecimal bigDecimalB = new BigDecimal(b);

                if (bigDecimalA.compareTo(bigDecimalB) > 0)
                    return -1;
                else if (bigDecimalA.compareTo(bigDecimalB) < 0)
                    return 1;
                else
                    return 0;
            }
        });

        return s;
    }
}
