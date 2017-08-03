package JavaAlgDaSt.Chp9;

import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 2/03/17.
 */
public class MainSimpleGraph {

    public static void main(String[] args) {
        SimpleGraph flyUS = new SimpleGraph(5);
        Listing2 l1 = new Listing2("Phili", "1st Av", "111 1111");
        Listing2 l2 = new Listing2("NY", "1st Av", "222 2222");
        Listing2 l3 = new Listing2("Boston", "1st Av", "333 3333");
        Listing2 l4 = new Listing2("LA", "1st Av", "444 4444");
        Listing2 l5 = new Listing2("San Fransisco", "1st Av", "555 5555");

        flyUS.insertVertex(0,l1);
        flyUS.insertVertex(1,l2);
        flyUS.insertVertex(2,l3);
        flyUS.insertVertex(3,l4);
        flyUS.insertVertex(4,l5);

        flyUS.insertEdge(0,1);
        flyUS.insertEdge(0,3);
        flyUS.insertEdge(1,2);
        flyUS.insertEdge(1,3);
        flyUS.insertEdge(2,1);
        flyUS.insertEdge(3,4);
        flyUS.insertEdge(4,0);
        flyUS.insertEdge(4,3);

        for(int i =0; i < 5; i++){
            System.out.println("hub " + i+ "\'s");
            flyUS.showVertex(i);
            System.out.println("its routes are: ");
            flyUS.showEdges(i);
        }
    }

}
