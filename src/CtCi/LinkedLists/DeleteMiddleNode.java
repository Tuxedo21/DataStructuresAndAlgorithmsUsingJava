package CtCi.LinkedLists;

import JavaAlgDaSt.Chap2.Node;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class DeleteMiddleNode {

    static boolean deleteMiddleNode(LinkedListNode removeNode){
        if(removeNode == null || removeNode.next == null)
            return false;
        else {

            removeNode.data = removeNode.next.data;
            removeNode.next = removeNode.next.next;
        return true;
        }
    }



    static class LinkedListNode{
        LinkedListNode next = null;
        int data;

        public LinkedListNode(int d){
            this.data = d;
        }

        void appendToTail(int d){
            LinkedListNode end = new LinkedListNode(d);
            LinkedListNode n = this;
            while (n.next != null){
                n = n.next;
            }
            n.next = end;
        }

    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        LinkedListNode temphead = head;

        while (head !=null){
            System.out.println(head.data);
            head = head.next;
        }



        head = temphead;
        System.out.println("=====");

        deleteMiddleNode(head.next.next.next);

        while (head !=null){
            System.out.println(head.data);
            head = head.next;
        }
    }


}
