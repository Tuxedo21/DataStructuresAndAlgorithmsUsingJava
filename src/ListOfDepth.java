import CtCi.TreesAndGraphs.tNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by tuxedo21 on 11/08/17.
 */
public class ListOfDepth {

    List<LinkedList<NodeT>> getList(tNode root){
            return null;
    }

            public static void main(){
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



            }
}

class NodeT{
    int value;
    NodeT right;
    NodeT left;
}