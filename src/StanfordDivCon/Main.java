package StanfordDivCon;

public class Main {

    public static void main(String[] args) {


        BTree<Integer> bTree = new BTree<>(30);

        bTree.insert(15);
        bTree.insert(40);
        bTree.insert(7);
        bTree.insert(10);
        bTree.insert(35);

        bTree.preorder();

//        bTree.hasData(15);
        if(bTree.hasData(15)) System.out.println("1"); else System.out.println("0");
        if(bTree.hasData(40)) System.out.println("1"); else System.out.println("0");
        if(bTree.hasData(7)) System.out.println("1"); else System.out.println("0");
        if(bTree.hasData(10)) System.out.println("1"); else System.out.println("0");
        if(bTree.hasData(35)) System.out.println("1"); else System.out.println("0");
        if(bTree.hasData(39)) System.out.println("1"); else System.out.println("0");


    }
}
