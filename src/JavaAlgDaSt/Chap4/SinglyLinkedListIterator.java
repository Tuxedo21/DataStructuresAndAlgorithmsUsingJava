package JavaAlgDaSt.Chap4;


import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 18/01/17.
 */
public class SinglyLinkedListIterator {

    private Node h;
    public Iterator i;

    public SinglyLinkedListIterator() {
        h = new Node();
        i = new Iterator();
        h.l = null;
        h.next = null;
    }

    public boolean insert(Listing2 newListing){
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

    public Listing2 fetch(String targetKey){
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

    public boolean update(String targetKey, Listing2 newListing){
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



    public class Iterator{
        private Node ip;

        public Iterator() {
            this.ip = h; // dummy node
        }

        public void reset(){
            this.ip = h;
        }

        public boolean hasNext(){
            return ip.next != null;
        }

        public Listing2 next(){
            ip = ip.next;
            return ip.l.deepCopy();
        }

        public void set(Listing2 newListing){
            ip.l = newListing.deepCopy();
        }
    }

    public class Node{
        private Listing2 l; //left
        private Node next; //right
        public Node(){

        }
    }



}
