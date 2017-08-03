package CtCi.LinkedLists;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class SumLists {

    static int sumLists(LinkedListNode x, LinkedListNode y){
        LinkedListNode xPlusY = null;
        Integer xPlusYint = 0;
        String xInt = "";
        String yInt = "";

        while (x != null){
            xInt = x.data + xInt;
            x = x.next;
        }

        while (y != null){
            yInt = y.data+ yInt;
            y = y.next;
        }

        System.out.println(xInt + "::" + yInt);

        xPlusYint = Integer.parseInt(xInt) + Integer.parseInt(yInt);

//        for (char ch: xPlusYint.toString().toCharArray()){
//            xPlusY.appendToTail(Character.getNumericValue(ch));
//        }
        
        return xPlusYint;


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
        LinkedListNode llOne = new LinkedListNode(7);
        llOne.appendToTail(1);
        llOne.appendToTail(6);

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
        System.out.println(sumLists(llOne,llTwo));

    }
}
