package org.example;

import org.example.practices.LongestCommonPrefix;

import static java.lang.System.*;

/**
 * Hello world!
 *
 */

public class App
{

    public static void main( String[] args ) throws Exception {

        out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"caa","","a","acb"}));

    }
}
