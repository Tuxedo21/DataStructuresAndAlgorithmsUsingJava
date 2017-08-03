package JavaAlgDaSt.Chap4;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by tuxedo21 on 26/01/17.
 */
public class MainAPILinkedListAndIteratorClasses {

    public static void main(String[] args) {
        LinkedList dataBase = new LinkedList();
        Listing2 b;
        Listing2 a;
        Listing2 bill = new Listing2("Bill","1st Avenue","133-5874");
        Listing2 al = new Listing2("Al","2nd Avenue","789-5874");
        // declare a ListIterator attached to the structure database
        ListIterator i = dataBase.listIterator();
        // add two phone listings to the data set
        i.add(bill);
        i.add(al);

        while (i.hasPrevious())
            i.previous();

        a = (Listing2) i.next();
        b = (Listing2) i.next();
        System.out.println(a);
        System.out.println(b);

        bill.setNumber("999 9999");

        //reset iterator
        while (i.hasPrevious())
            i.previous();

        a = (Listing2) i.next();
        System.out.println(a);
    }

}
