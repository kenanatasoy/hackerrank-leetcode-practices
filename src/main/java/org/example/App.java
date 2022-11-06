package org.example;

import org.example.practices.LinkedListNode;

import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.*;

public class App {

    public static void main(String[] args) throws IOException {

        LinkedListNode linkedListNode1 =
                new LinkedListNode();
        linkedListNode1.val = 4;
//        LinkedListNode linkedListNode2 = new LinkedListNode();
//        linkedListNode2.val = 5;
//        LinkedListNode linkedListNode3 = new LinkedListNode();
//        linkedListNode3.val = 2;

//        linkedListNode1.next = linkedListNode2;
//        linkedListNode2.next = linkedListNode3;
//        linkedListNode3.next = null;

        int i;
        while((i = in.read()) != 32){
            out.print((char)i);
        }

        out.println((char)i);



//        Random rand = new Random();
//        int rdNum = rand.nextInt( (max - min) + 1 ) + min; // min-max included
//        out.println();

        char[][] grid = new char[][]
                {{'S', '.', '.', '#', '.', '.', '.'},
                 {'.', '#', '.', '.', '.', '#', '.'},
                 {'.', '#', '.', '.', '.', '.', '.'},
                 {'.', '.', '#', '#', '.', '.', '.'},
                 {'#', '.', '#', 'E', '.', '#', '.'}};

    }




}

