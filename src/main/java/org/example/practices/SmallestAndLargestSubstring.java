package org.example.practices;

public class SmallestAndLargestSubstring {

    public String getSmallestAndLargest(String s, int k) {

        String currStr = s.substring(0, k);

        String lexMin = currStr;
        String lexMax = currStr;

        for (int i = k; i < s.length(); i++) {
            currStr = currStr.substring(1, k) + s.charAt(i);
            if (lexMax.compareTo(currStr) < 0)
                lexMax = currStr;
            if (lexMin.compareTo(currStr) > 0)
                lexMin = currStr;
        }

        return lexMin + "\n" + lexMax;
    }
}
