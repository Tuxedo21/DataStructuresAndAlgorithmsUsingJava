package MyDataStructures;

import java.util.ArrayList;

/**
 * Created by tuxedo21 on 28/08/17.
 */
public class cGraphNode<T extends Comparable> {

    public T data;
    public ArrayList<cGraphNode<T>> adj;


    public cGraphNode(T data) {
        this.data = data;
        this.adj = new ArrayList<>();
    }
    @Override
    public String toString() {

        if (adj.isEmpty())
            return data.toString() ;
        else
        return data.toString() + "; children :" + this.adj.get(0).data + " " + this.adj.get(1).data+",";
    }
}
