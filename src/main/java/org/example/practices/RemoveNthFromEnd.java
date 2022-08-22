package org.example.practices;

public class RemoveNthFromEnd {

    public LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {

        LinkedListNode beforeHead = new LinkedListNode();
        beforeHead.next = head;

        LinkedListNode firstPointer = head;
        LinkedListNode secondPointer = beforeHead;

        for(int i = 0; i < n; i++){
            firstPointer = firstPointer.next;
        }

        while(firstPointer != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        secondPointer.next = secondPointer.next.next;

        return beforeHead.next;

    }



}
