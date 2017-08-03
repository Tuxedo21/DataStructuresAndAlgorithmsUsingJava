package CtCi.LinkedLists;

import java.util.HashSet;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class Intersection {

    static LinkedListNode intesrection(LinkedListNode llOne, LinkedListNode llTwo){

        LinkedListNode tempOne = llOne;
        LinkedListNode tempTwo = llTwo;
        HashSet<LinkedListNode> set = new HashSet<>();

        while (llOne != null){

            set.add(llOne);
            llOne = llOne.next;

        }
        while (llTwo != null){
            if (set.contains(llTwo))
                return llTwo;

            llTwo = llTwo.next;
        }
        return null;

    }

    static class LinkedListNode{
        LinkedListNode next = null;
        Integer data;

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
        LinkedListNode llOne = new LinkedListNode(1);
        llOne.appendToTail(1);
        llOne.appendToTail(2);
        llOne.appendToTail(3);
        llOne.appendToTail(2);
        llOne.appendToTail(1);
        llOne.appendToTail(1);


        LinkedListNode llTwo = llOne;
        llTwo.appendToTail(9);
        llTwo.appendToTail(2);

        LinkedListNode tempOne = llOne;
        LinkedListNode tempTwo = llTwo;


        while (llOne !=null){
            System.out.println(llOne.data);
            llOne = llOne.next;
        }



        llOne = tempOne;
        System.out.println("=====");
        System.out.println(intesrection(llOne,llTwo));
    }


}
