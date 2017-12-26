package MyDataStructures;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tuxedo21 on 28/08/17.
 */
public class main {



    public static void main(String[] args) throws IOException {
        String filename = "/home/tuxedo21/Documents/Internships/MicrosoftChallangesPython/RetoMicrosoft/PracticeInputSmall.txt";
        Scanner scan = new Scanner(Paths.get(filename));
        ArrayList<cGraphNode> allTheIntsOrder = new ArrayList<>();



        int pyLength = scan.nextInt();

        while (scan.hasNext()){
            allTheIntsOrder.add( new cGraphNode(scan.nextInt()));
        }

        int n = 1;
        int j = 0;
        for (int i = 0; i < allTheIntsOrder.size(); i++){
            if ( !(n == pyLength)) {
                allTheIntsOrder.get(i).adj.add(allTheIntsOrder.get(i + n));
                allTheIntsOrder.get(i).adj.add(allTheIntsOrder.get(i + n + 1));
                j++;
            }
            if ( j == n) {
                n++;
                j=0;
            }
        }

        System.out.println(allTheIntsOrder.get(1));
        System.out.println("Done");
//        allTheNodes.add(new cGraphNode<Integer>(allTheIntsOrder.get(0)));
//        allTheNodes.
//
//        System.out.println(allTheIntsOrder.toString());

//        cGraphNode<Integer> sixOne = new cGraphNode<>("2",61);
//        cGraphNode<Integer> zeroTwo = new cGraphNode<>("2",02);
//
//        allTheNodes.put("one",sixOne);
//        allTheNodes.put("one",zeroTwo);
//        System.out.println(allTheNodes.toString());
//        cGraphNode<String> twoSeven = new cGraphNode<>("27");
//
//        sixOne.adj.add(zeroTwo);
//        sixOne.adj.add(twoSeven);
//
//        System.out.println(sixOne);

    }
}
