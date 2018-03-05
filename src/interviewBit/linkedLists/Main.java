package interviewBit.linkedLists;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    static class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }

    public ListNode deleteDuplicates(ListNode A) {

        ListNode listNode = A;

        while(A.next != null){

            if (A.next.val == A.val){//science

                A.next = A.next.next;

            }else {
                A = A.next;
            }


        }

        return listNode;

    }

        // I was too sloppy, got very close. But not enough, also did not think corner cases
        public ListNode swapPairs(ListNode A) {
            if (A == null || A.next == null) return A;
            ListNode current = A;
            ListNode root = A.next;
            ListNode prev = null;
            while (current != null && current.next !=null) {
                ListNode next = current.next;
                ListNode temp = next.next;
                current.next = temp;
                if (prev != null) prev.next = next;
                next.next = current;
                prev = current;
                current = temp;
            }
            return root;
        }


//    public ListNode getIntersectionNode(ListNode a, ListNode b) {
//
//        //travers save x
//
//        //travers save y
//
//    }


    static public ListNode detectCycle(ListNode a) {

        HashSet<Integer> hashSet = new HashSet<>();

        return detectCycle(a, hashSet);

    }


    static public ListNode fastDetectCycle(ListNode a) {

        if (a == null)
            return null;

        ListNode slow = a, fast = a;

        try {
            do {
                fast = fast.next.next;
                slow = slow.next;
            } while (fast != slow && fast != null);
        } catch (Exception e){}

        if (slow == null || fast == null || slow != fast)
            return null;

        slow = a;

        while (slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;



    }

    static public ListNode detectCycle(ListNode a, HashSet<Integer> hashSet) {



        if (a.next == null)
            return null;

        else if( hashSet.contains(a.val) )
            return a;

        else{
            hashSet.add(a.val);
            return detectCycle(a.next, hashSet);
        }





    }


    public static void main(String[] args) {

    }
}
