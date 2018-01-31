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
