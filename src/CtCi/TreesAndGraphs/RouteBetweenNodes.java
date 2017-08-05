package CtCi.TreesAndGraphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by tuxedo21 on 4/05/17.
 */
public class RouteBetweenNodes {

static boolean searchPath(gNode start, gNode end){
    if (start == end)
        return true;
    gNode u;
    LinkedList<gNode> queue = new LinkedList<>();
    queue.add(start);
    while (!queue.isEmpty()){
        u = queue.removeFirst();
        for (gNode v : u.getAdjacent()){
            if(v.state == State.Unvisited){
                if(v == end)
                    return true;
                else
                    queue.add(v);
            }
        }
        u.state = State.Visited;
    }
    return false;
}

public static void main(String[] args) {

        gNode s0 = new gNode(State.Unvisited,"0");gNode s1 = new gNode(State.Unvisited,"1");gNode s2 = new gNode(State.Unvisited,"2");gNode s3 = new gNode(State.Unvisited,"3");gNode s4 = new gNode(State.Unvisited,"4");gNode s5 = new gNode(State.Unvisited,"5");
        gNode s6 = new gNode(State.Unvisited,"6");gNode s7 = new gNode(State.Unvisited,"7");gNode s8 = new gNode(State.Unvisited,"8");  gNode s9 = new gNode(State.Unvisited,"9");     gNode s10 = new gNode(State.Unvisited,"10");

        s0.addAdjacent(s1);
        s0.addAdjacent(s2);
        s0.addAdjacent(s3);

        s1.addAdjacent(s0);
        s1.addAdjacent(s10);
        s1.addAdjacent(s3);

        s2.addAdjacent(s5);
        s2.addAdjacent(s6);
        s2.addAdjacent(s7);

        s5.addAdjacent(s0);

   // System.out.println(searchPath(s0,s3)+"");
    System.out.println(searchPath(s0,s10)+"");
   // System.out.println(searchPath(s1,s10)+"");



}

}
