package JavaAlgDaSt.Chap4;

import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 20/01/17.
 */
public class MainSinglyLinkedListStack {

    public static void main(String[] args) {
        SinglyLinkedListIterator boston = new SinglyLinkedListIterator();
        Listing2 l1 = new Listing2("x","23 1st Avenue","133-5874");
        Listing2 l2 = new Listing2("x","1 23rd Avenue","789-5874");
        Listing2 l3 = new Listing2("x","13 2rd Avenue","786-5174");

        boston.insert(l1);
        boston.insert(l2);
        boston.insert(l3);

        l3 = boston.fetch("x"); // first pop
        boston.delete("x");
        System.out.println(l3.toString());

        l3 = boston.fetch("x"); // second pop
        boston.delete("x");
        System.out.println(l3.toString());

        l3 = boston.fetch("x"); // third pop
        boston.delete("x");
        System.out.println(l3.toString());

        System.exit(0);
    }
}
