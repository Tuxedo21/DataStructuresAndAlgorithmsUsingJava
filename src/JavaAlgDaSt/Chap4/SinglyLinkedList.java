package JavaAlgDaSt.Chap4;


import JavaAlgDaSt.Chap3.Listing;

/**
 * Created by tuxedo21 on 18/01/17.
 */
public class SinglyLinkedList {

    private Node h;

    public SinglyLinkedList(Node h) {
        h = new Node();
        h.l = null;
        h.next = null;
    }

    public boolean insert(Listing newListing){
        Node n = new Node();
        if(n == null)
            return false;
        else {
            n.next = h.next;
            h.next = n;
            n.l = newListing.deepCopy();
            return true;
        }
    }

    public Listing fetch(String targetKey){
        Node p = h.next;
        while (p != null && !(p.l.compareTo(targetKey) == 0 )) {
            p = p.next;
        }
        if(p != null){
            return p.l.deepCopy();
        }else
            return null;
    }

    public boolean delete(String targetKey){
        Node q = h;
        Node p = h.next;
        while (p !=  null && !(p.l.compareTo(targetKey) == 0)){
            q = p;
            p = p.next;
        }if(p != null){
            q.next = p.next;
            return true;
        }else
            return false;
    }

    public boolean update(String targetKey, Listing newListing){
        if(delete(targetKey) == false)
            return false;
        else if(insert(newListing) == false)
            return false;
        else
            return true;
    }

    public void showAll(){
        Node p = h.next;
        while (p != null){
            System.out.println(p.l.toString());
            p = p.next;
        }
    }

    public class Node{
        private Listing l; //left
        private Node next; //right
        public Node(){

        }
    }
}
