package CtCi.TreesAndGraphs;

/**
 * Created by tuxedo21 on 3/08/17.
 */

public  class gNode {


     State state;
     String name;

    public gNode(State state, String name){
        this.state = state;
        this.name = name;
    }

    public gNode deepCopy(){
        gNode clone = new gNode(this.state,this.name);
        return clone;
    }
}
