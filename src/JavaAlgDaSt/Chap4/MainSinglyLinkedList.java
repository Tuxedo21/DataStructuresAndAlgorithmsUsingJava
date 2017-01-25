package JavaAlgDaSt.Chap4;

import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 18/01/17.
 */
public class MainSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedListIterator boston = new SinglyLinkedListIterator();
        Listing2 l1 = new Listing2("Bill","23 1st Avenue","133-5874");
        Listing2 l2 = new Listing2("Al","1 23rd Avenue","789-5874");
        Listing2 l3 = new Listing2("Mike","13 2rd Avenue","786-5174");

        boston.insert(l1);
        boston.insert(l2);
        boston.insert(l3);
        boston.showAll();

        l3 = boston.fetch("Mike");
        System.out.println(l3.toString());

        boston.delete("Al");
        boston.showAll();

        boston.update("Mike",l2);
        boston.showAll();
        System.exit(0);

    }

}
