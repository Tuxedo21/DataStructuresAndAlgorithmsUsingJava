package JavaAlgDaSt.Chap7;

import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 26/02/17.
 */
public class MainBinaryTree {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        Listing2 l;
        Listing2 l1 = new Listing2("Ann", "1st Av", "111 1111");
        Listing2 l2 = new Listing2("Bill", "1st Av", "222 2222");
        Listing2 l3 = new Listing2("Carol", "1st Av", "333 3333");
        Listing2 l4 = new Listing2("Mike", "1st Av", "444 4444");
        Listing2 l5 = new Listing2("Pat", "1st Av", "555 5555");
        Listing2 l6 = new Listing2("Sally", "1st Av", "666 6666");
        Listing2 l7 = new Listing2("Ted", "1st Av", "777 7777");
        Listing2 l8 = new Listing2("Vick", "1st Av", "888 8888");
        Listing2 l9 = new Listing2("Will", "1st Av", "999 9999");
        Listing2 l10 = new Listing2("Zack", "1st Av", "101 1010");
        Listing2 l11 = new Listing2("Zeek", "1st Av", "121 1212");

        t.insert(l9);
        t.insert(l7);
        t.insert(l10);
        t.insert(l2);
        t.insert(l8);
        t.insert(l1);
        t.insert(l4);
        t.insert(l3);
        t.insert(l6);
        t.insert(l5);

        System.out.println(t.fetch("Carol"));
        System.out.println(t.fetch("Sally"));
        System.out.println(t.fetch("Ted"));

        t.delete("Carol");
        System.out.println(t.fetch("Carol"));
        t.delete("Sally");
        System.out.println(t.fetch("Sally"));
        t.delete("Ted");
        System.out.println(t.fetch("Ted"));

        t.update("Bill",l3);
        System.out.println(t.fetch("Carol"));
        System.out.println(t.fetch("Bill"));

        System.out.println("LNR Traversal:");
        t.LNRtraversal(t.root);

        System.exit(0);
    }

}
