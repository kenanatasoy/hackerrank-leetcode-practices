package org.example.practices;

public class ReverseLinkedList {

    LinkedListNode head;
    public LinkedListNode reverseList(LinkedListNode head) {

        reverseListRecursively(head);
        return this.head;

    }


    private void reverseListRecursively(LinkedListNode p){

        if(p.next == null){
            head = p;
            return;
        }

        reverseListRecursively(p.next);

        LinkedListNode q = p.next;
        q.next = p;
        p.next = null;

    }
}
