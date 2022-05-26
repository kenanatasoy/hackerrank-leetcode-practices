package org.example.practices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StaticInitializerBlock {

    private static byte B;
    private static byte H;
    private static int area;
    private static BufferedReader rd;

    static {

        try{
            rd = new BufferedReader(new InputStreamReader(System.in));
            B = Byte.parseByte(rd.readLine());
            H = Byte.parseByte(rd.readLine());
        }
        catch(Exception e){ }

    }


    public static void main(String[] args) {

        if(B > 0 && H > 0){
            area = (int)B*(int)H;
            System.out.printf("%d", area);
        }

        else
            System.out.print("java.lang.Exception: Breadth and height must be positive");


    }

}
