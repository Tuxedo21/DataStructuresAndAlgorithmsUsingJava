package CtCi.LinkedLists;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class Partition {

    public static LinkedListNode partition(LinkedListNode head, int partition){
        LinkedListNode greater = null;
        LinkedListNode less= null;

        while ( head !=null){
            if(head.data >= partition){
                if(greater == null)//append to greater
                    greater = new LinkedListNode(head.data);
                else
                    greater.appendToTail(head.data);
            }else  {
                if(less == null)//append to less
                    less = new LinkedListNode(head.data);
                else
                    less.appendToTail(head.data);
            }
            head = head.next;

        }

        LinkedListNode tempLess = less;
        while (less.next !=null){
            less = less.next;
        }
        less.next = greater;
        return tempLess;
        // O(n) + O(n/len(less)) -> O(n)
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
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);

        LinkedListNode temphead = head;

        while (head !=null){
            System.out.println(head.data);
            head = head.next;
        }



        head = temphead;
        System.out.println("=====");
        LinkedListNode mod = partition(head,5);
        while (mod !=null){
            System.out.println(mod.data);
            mod = mod.next;
        }

    }
}
