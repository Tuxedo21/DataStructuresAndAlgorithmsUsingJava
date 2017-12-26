package MyDataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class jNode<T extends Comparable> {

    public T data;
    public boolean visit;
    private boolean found;
    private ArrayList<jNode<T>> adj;

    public jNode(){
        adj = new ArrayList<>();
        visit = false;
    }
    public jNode(T data){
        this.data = data;
        adj = new ArrayList<>();
        visit = false;
    }

    public void add(T data){
        adj.add(new jNode<>(data));
    }
    public void add(jNode<T> node){
        adj.add(node);
    }

    public ArrayList<jNode<T>> getAdj() {
        return adj;
    }

    public boolean hasNode(T data){
        for(jNode<T> n : adj){
            if(n.data.equals(data))
                return true;
        }
        return false;
    }
    public boolean hasNode(jNode<T> node){
        return adj.contains(node);
    }

    public boolean searchDFS(T data){
        found = false;
        searchDFS(this,data);
        return found;
    }
    private void searchDFS(jNode<T> node, T data){
        node.visit = true;
        if(node.data.equals(data)) {
            this.found = true;
            return;
        }
        for(jNode<T> n: node.adj){
            if(!n.visit){
                searchDFS(n,data);
            }
        }
    }

    public boolean searchBFS(T data){

        LinkedList<jNode<T>> queue = new LinkedList<>();

        visit = true;
        queue.add(this);

        while(!queue.isEmpty()){
            jNode<T> node= queue.pop();

            node.visit=true;
            if(node.data.equals(data))
                return true;

            for(jNode<T> n : node.adj){
                if(!n.visit){
                    n.visit = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }

    public ArrayList<jNode<T>> getGraph() {
        ArrayList<jNode<T>> graph = new ArrayList<>();
        getGraph(graph);
        graph.forEach((n) -> n.visit=false);
        return graph;
    }
    private void getGraph(ArrayList<jNode<T>> list){
        visit = true;
        list.add(this);

        LinkedList<jNode<T>> queue = new LinkedList<>();

        queue.add(this);

        while(!queue.isEmpty()){
            jNode<T> node= queue.pop();

            node.visit=true;

            for(jNode<T> n : node.adj){
                if(!n.visit){
                    n.visit = true;
                    queue.add(n);
                    list.add(n);
                }
            }
        }
    }

}
