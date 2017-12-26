package Helpers;


import java.util.ArrayList;

public class NodeG<T extends Comparable,Y extends Comparable>{

    public T key;
    public ArrayList<Pair<T,Y>> adj;

    public NodeG(){
        adj = new ArrayList<>();
    }

    public NodeG(T key) {
        this.key = key;
        adj = new ArrayList<>();
    }

    public boolean hasValue(T key){
        for (Pair<T,Y> p : adj){
            if (p.key.equals(key))
                return true;
        }
        return false;
    }
}
