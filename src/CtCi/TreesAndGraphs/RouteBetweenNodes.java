package CtCi.TreesAndGraphs;


import java.util.LinkedList;

/**
 * Created by tuxedo21 on 4/05/17.
 */
public class RouteBetweenNodes {

static boolean searchPath(SimpleGraph graph, gNode start, gNode end){
    if(start.equals(end))
        return true;
    LinkedList<gNode> queue = new LinkedList<>();
    start.state = State.Visiting;
    queue.add(start);
    gNode u;
    while (!queue.isEmpty()){
        u = queue.removeFirst(); // dequeue
        if (u != null){

        }
    }
    return false;
}



public static void main(String[] args) {

        SimpleGraph graph = new SimpleGraph(50);
        gNode s0 = new gNode(State.Unvisited,"0");
        gNode s1 = new gNode(State.Unvisited,"1");
        gNode s2 = new gNode(State.Unvisited,"2");
        gNode s3 = new gNode(State.Unvisited,"3");
        gNode s4 = new gNode(State.Unvisited,"4");
        gNode s5 = new gNode(State.Unvisited,"5");
        gNode s6 = new gNode(State.Unvisited,"6");
        gNode s7 = new gNode(State.Unvisited,"7");
        gNode s8 = new gNode(State.Unvisited,"8");
        gNode s9 = new gNode(State.Unvisited,"9");
        gNode s10 = new gNode(State.Unvisited,"10");
        gNode s11 = new gNode(State.Unvisited,"11");
        gNode s12 = new gNode(State.Unvisited,"12");
        gNode s13 = new gNode(State.Unvisited,"13");
        gNode s14 = new gNode(State.Unvisited,"14");
        gNode s15 = new gNode(State.Unvisited,"15");
        gNode s16 = new gNode(State.Unvisited,"16");
        gNode s17 = new gNode(State.Unvisited,"17");
        gNode s18 = new gNode(State.Unvisited,"18");
        gNode s19 = new gNode(State.Unvisited,"19");
        gNode s20 = new gNode(State.Unvisited,"20");
        gNode s21 = new gNode(State.Unvisited,"21");


        graph.insertVertex(0,s0);graph.insertVertex(1,s1);graph.insertVertex(2,s2);graph.insertVertex(3,s3);graph.insertVertex(4,s4);graph.insertVertex(5,s5);
        graph.insertVertex(6,s6);graph.insertVertex(7,s7);graph.insertVertex(8,s8);graph.insertVertex(9,s9);graph.insertVertex(10,s10);graph.insertVertex(11,s11);
        graph.insertVertex(12,s12);graph.insertVertex(13,s13);graph.insertVertex(14,s14);graph.insertVertex(15,s15);graph.insertVertex(16,s16);
        graph.insertVertex(17,s17);graph.insertVertex(18,s18);graph.insertVertex(19,s19);graph.insertVertex(20,s20);graph.insertVertex(21,s21);

        graph.insertEdge(0,1);
        graph.insertEdge(0,3);
        graph.insertEdge(1,2);
        graph.insertEdge(1,3);
        graph.insertEdge(2,1);
        graph.insertEdge(3,4);
        graph.insertEdge(4,0);
        graph.insertEdge(4,3);
        graph.insertEdge(5,0);
        graph.insertEdge(5,1);
        graph.insertEdge(5,2);
        graph.insertEdge(5,3);
        graph.insertEdge(5,4);


        for(int i =0; i < 50; i++){
            System.out.println("Vertex " + i+ "\'s");
            graph.showVertex(i);
            //System.out.println("its routes are: ");
            //graph.showEdges(i);
        }

        System.out.println(s0.equals(s1));



    }

}
