package CtCi.TreesAndGraphs;

import java.util.ArrayList;

/**
 * Created by tuxedo21 on 3/08/17.
 */

public  class gNode {

    State state;
    String name;
    ArrayList<gNode> adjacent;

    public gNode(State state, String name){
        this.state = state;
        this.name = name;
    }



    public void setAdjacent(ArrayList<gNode> adjacent) {
        this.adjacent = adjacent;
    }

    public ArrayList<gNode> getAdjacent() {
        return adjacent;
    }

//
//    public gNode deepCopy(){
//        gNode clone = new gNode(this.state,this.name,this.adjacent);
//        return clone;
//    }
}
