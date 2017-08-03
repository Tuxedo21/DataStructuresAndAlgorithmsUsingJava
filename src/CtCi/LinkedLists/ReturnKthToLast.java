package CtCi.LinkedLists;

/**
 * Created by tuxedo21 on 1/05/17.
 */
public class ReturnKthToLast {



    public static int returnKthToLast(LinkedListNode head, int kth){
        LinkedListNode temp = head;
        int length = 0;
        while (head != null){
            head = head.next;
            length++;
        }
        head = temp;

        if(kth > length)
            return -1;
        else{
            for (int i=0;i < length - kth;i++) {
                head = head.next;
            }
            return head.data;
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
        System.out.println(returnKthToLast(head,5));

    }

}
