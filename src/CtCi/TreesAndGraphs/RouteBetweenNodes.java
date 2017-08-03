package CtCi.TreesAndGraphs;


/**
 * Created by tuxedo21 on 4/05/17.
 */
public class RouteBetweenNodes {



    static class Node {
        public String name;
        public Node[] childern;
    }


    static class Tree{
        public Node root;
    }


    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new Node();
        tree.root.name = "21";


        Node n12 = new Node();
        Node n13 = new Node();

        tree.root.childern = new Node[] {n12,n13};

    }

}
