package JavaAlgDaSt.Chap4;

import JavaAlgDaSt.Chap4.Listing2;
import JavaAlgDaSt.Chap4.SinglyLinkedListIterator;

/**
 * Created by tuxedo21 on 24/01/17.
 */
public class MainSinglyLinkedListIterator {

    public static void main(String[] args) {
        SinglyLinkedListIterator boston = new SinglyLinkedListIterator();
        String number;
        Listing2 l1 = new Listing2("Bill","1st Avenue","133-5874");
        Listing2 l2 = new Listing2("Al","2nd Avenue","789-5874");
        Listing2 l3 = new Listing2("Mike","3rd Avenue","786-5174");



        boston.insert(l1);
        boston.insert(l2);
        boston.insert(l3);

        while (boston.i.hasNext()){
            System.out.println(boston.i.next());
        }

        boston.i.reset();

        while (boston.i.hasNext()){
            l1 = boston.i.next();
            number = l1.getNumber();
            number = "631 " + number;
            l1.setNumber(number);
            boston.i.set(l1);
        }

        boston.i.reset();

        while (boston.i.hasNext()){
            System.out.println(boston.i.next());
        }
        System.exit(0);
    }

}
