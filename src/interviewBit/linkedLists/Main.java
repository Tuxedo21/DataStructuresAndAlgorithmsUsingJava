package interviewBit.linkedLists;

public class Main {

    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
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


    public static void main(String[] args) {

    }
}
