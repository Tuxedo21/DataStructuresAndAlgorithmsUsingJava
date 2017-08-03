package CtCi.LinkedLists;

import JavaAlgDaSt.Chap2.Node;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class RemoveDups {

    public static void removeDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode prev = null;
        while (n != null){
            if(set.contains(n.data)){
                prev.next = n.next;
            }else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
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

        LinkedListNode head = new LinkedListNode(3);
        head.appendToTail(4);
        head.appendToTail(4);
        head.appendToTail(3);
        head.appendToTail(5);

        LinkedList t = new LinkedList();


        LinkedListNode temphead = head;

        while (head !=null){
            System.out.println(head.data);
            head = head.next;
        }


        head = temphead;
        removeDups(head);

        System.out.println("=====");
        while (head !=null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}
