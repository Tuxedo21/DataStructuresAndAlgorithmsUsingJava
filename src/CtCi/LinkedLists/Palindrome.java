package CtCi.LinkedLists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class Palindrome {


    static boolean palindrome(LinkedListNode linkedListNode){

        String string = "";

        while (linkedListNode != null){

            string +=  linkedListNode.data;
            linkedListNode = linkedListNode.next;

        }
        char [] stringArray =  string.toCharArray();
        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < stringArray.length / 2; i++){

            if( stringArray[i] != stringArray[stringArray.length - i -1] ){
                return false;
            }

        }
        return true;

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


        LinkedListNode llTwo = new LinkedListNode(5);
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
        System.out.println(palindrome(llOne));
        System.out.println(palindrome(llTwo));
    }

}
