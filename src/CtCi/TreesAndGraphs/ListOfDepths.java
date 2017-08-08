package CtCi.TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by tuxedo21 on 4/05/17.
 */
public class ListOfDepths {


    public static ArrayList<LinkedList> getLists(tNode root){
        ArrayList<LinkedList> lists = new ArrayList<>();
        int listNum = getDepthOfTree(root);

       for (int i = 0; i < listNum; i++){
           lists.add(new LinkedList());
       }

        return getLists(root, root , lists);
    }

    public static ArrayList<LinkedList> getLists(tNode root, tNode node,ArrayList<LinkedList> lists){

        if (node == null)
            return lists;

        int index = getDepthOfNode(root, node);
        lists.get(index).add(node);

        lists = getLists(root,node.left,lists);
        lists = getLists(root,node.right,lists);

        return lists;

    }

    public static int getDepthOfNode(tNode root, tNode node){
        int i = 0;
        while ( root != null && root != node  ){
            if (node.value <= root.value  ){
                root = root.left; i++;}
            else if(node.value > root.value){
                root = root.right; i++;}
        }
        if(root == null)
            return -1;
        return i;
    }

    public static int getDepthOfTree(tNode node){
        if(node == null)
            return 0;
        int left = getDepthOfTree(node.left);
        int right = getDepthOfTree(node.right);

        int x = left > right ? left+1 : right+1;
        return x;
    }


    public static void main(String[] args) {
        tNode twoOne = new tNode(21);
        tNode oneOne = new tNode(11);
        tNode threeOne = new tNode(31);

        twoOne.left = oneOne;
        twoOne.right = threeOne;

        tNode nine = new tNode(9);
        tNode oneSeven = new tNode(17);

        oneOne.left = nine;
        oneOne.right = oneSeven;

        tNode twoSeven = new tNode(27);
        tNode threeSeven = new tNode(37);

        threeOne.left = twoSeven;
        threeOne.right = threeSeven;

        tNode dummy = new tNode(100);
       // nine.left = dummy;

        System.out.println(getDepthOfNode(twoOne,threeSeven)+"");
        System.out.println(getDepthOfTree(twoOne) + "");
        System.out.println(5 < 4 ? 1 : 3);

       ArrayList<LinkedList> lists =  getLists(twoOne);

        for (LinkedList l : lists){
            System.out.print("List ");
            for (Object n : l){
                System.out.print(n.toString()+", ");
            }
            System.out.println("\n");
        }

    }
}
