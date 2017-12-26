package MyDataStructures;

import java.util.*;

public class jNodeWeighted<T extends Comparable> implements Comparable<jNodeWeighted<T>>{

    public T data;
    public boolean visit;
    private boolean found;

    public Double path_weight;
    public jNodeWeighted<T> previous;

    private ArrayList<jNodeWeighted<T>> adj;

    public Double weight;
    public HashMap<jNodeWeighted<T>,Double> links;

    public jNodeWeighted(T data) {
        this.data = data;
        adj = new ArrayList<>();
        links = new HashMap<>();
    }
    public jNodeWeighted(T data, Double weight){
        this.data = data;
        this.weight = weight;
        adj = new ArrayList<>();
        links = new HashMap<>();
    }
    public jNodeWeighted() {
        adj = new ArrayList<>();
        links = new HashMap<>();
    }
    public jNodeWeighted(Double weight){
        this.weight = weight;
        adj = new ArrayList<>();
        links = new HashMap<>();
    }

    public boolean hasNode(T data){
        for(jNodeWeighted<T> n : adj){
            if(n.data.equals(data))
                return true;
        }
        return false;
    }
    public boolean hasNode(jNodeWeighted<T> node){
        return adj.contains(node);
    }

    public boolean searchDFS(T data){
        found = false;
        searchDFS(this,data);
        return found;
    }
    private void searchDFS(jNodeWeighted<T> node, T data){

        node.visit = true;

        if(node.data.equals(data)) {
            this.found = true;
            return;
        }
        for(jNodeWeighted<T> n : node.adj){
            if(!n.visit)
                searchDFS(n,data);
        }
    }

    public boolean searchBFS(T data){

        LinkedList<jNodeWeighted<T>> queue = new LinkedList<>();

        visit = true;
        queue.add(this);

        while(!queue.isEmpty()){
            jNodeWeighted<T> node= queue.pop();

            node.visit=true;
            if(node.data.equals(data))
                return true;

            for(jNodeWeighted<T> n : node.adj){
                if(!n.visit){
                    n.visit = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }

    public ArrayList<jNodeWeighted<T>> getGraph() {
        ArrayList<jNodeWeighted<T>> graph = new ArrayList<>();
        getGraph(graph);
        graph.forEach((n) -> n.visit=false);
        return graph;
    }
    private void getGraph(ArrayList<jNodeWeighted<T>> list){
        list.add(this);

        LinkedList<jNodeWeighted<T>> queue = new LinkedList<>();

        queue.add(this);

        while(!queue.isEmpty()){
            jNodeWeighted<T> node= queue.pop();

            node.visit=true;

            for(jNodeWeighted<T> n : node.adj){
                if(!n.visit){
                    n.visit = true;
                    queue.add(n);
                    list.add(n);
                }
            }
        }
    }

    public void add(jNodeWeighted<T> node,Double weight){
        adj.add(node);
        links.put(node,weight);
    }
    public void add(T data, Double weight){
        jNodeWeighted<T> node = new jNodeWeighted<>(data);
        adj.add(node);
        links.put(node,weight);
    }

    private void rearrange(){
        ArrayList<jNodeWeighted<T>> graph = getGraph();

        for(jNodeWeighted<T> n : graph){
            n.links.clear();
            for(jNodeWeighted<T> tmp : n.adj){
                n.links.put(tmp,tmp.weight);
            }
        }
    }



    public ArrayList<jNodeWeighted<T>> getAdj() {
        return adj;
    }

    public jNodeWeighted<T> dijkstra(T end){
        LinkedList<jNodeWeighted<T>> remaining = new LinkedList<>();

        jNodeWeighted<T> endNode = new jNodeWeighted<>();

        /**
         * path_weight[node] -> peso del camino hacia el nodo. Todos son inifito menos init
         *
         * previous[node] -> mapa del nodo previo en el actual camino
         *
         * remaining -> priorityQueue de los nodos, cada prioridad definida por el path_weight
         */
        for(jNodeWeighted<T> n : getGraph()){
            if(n.equals(this)){
                this.path_weight = 0d;
                remaining.add(this);
            }else{
                n.path_weight = Double.MAX_VALUE;
                remaining.add(n);
            }

            if(n.data.equals(end))
                endNode = n;
        }

        Collections.sort(remaining);

        while(!remaining.isEmpty()){
            jNodeWeighted<T> n= remaining.poll();

            //Of node 'n' we have the links
            for(jNodeWeighted<T> tmp : n.adj){
                Double current = tmp.path_weight;
                Double path;
                if (n.path_weight < tmp.path_weight) {
                    path = n.links.get(tmp) + n.path_weight;
                } else
                    path = tmp.path_weight;

                if(path<current){
                    tmp.path_weight = path;
                    tmp.previous = n;
                    Collections.sort(remaining);
                }
            }
        }

        return endNode;
    }

    public jNodeWeighted<T> dijkstra(jNodeWeighted<T> end){
        LinkedList<jNodeWeighted<T>> remaining = new LinkedList<>();

        jNodeWeighted<T> endNode = end;

        /**
         * path_weight[node] -> peso del camino hacia el nodo. Todos son inifito menos init
         *
         * previous[node] -> mapa del nodo previo en el actual camino
         *
         * remaining -> priorityQueue de los nodos, cada prioridad definida por el path_weight
         */
        for(jNodeWeighted<T> n : getGraph()){
            if(n.equals(this)){
                this.path_weight = 0d;
                remaining.add(this);
            }else{
                n.path_weight = Double.MAX_VALUE;
                remaining.add(n);
            }

        }

        Collections.sort(remaining);

        while(!remaining.isEmpty()){
            jNodeWeighted<T> n= remaining.poll();

            //Of node 'n' we have the links
            for(jNodeWeighted<T> tmp : n.adj){
                Double current = tmp.path_weight;
                Double path;
                if (n.path_weight < tmp.path_weight) {
                    path = n.links.get(tmp) + n.path_weight;
                } else
                    path = tmp.path_weight;

                if(path<current){
                    tmp.path_weight = path;
                    tmp.previous = n;
                    Collections.sort(remaining);
                }
            }
        }

        return endNode;
    }

    public jNodeWeighted<T> dijkstra_v2(T end){
        rearrange();
        return dijkstra(end);
    }
    public jNodeWeighted<T> dijkstra_v2(jNodeWeighted<T> end){
        rearrange();
        return dijkstra(end);
    }

    public jNodeWeighted<T> dijkstra_v21(T end){
        rearrange();
        jNodeWeighted<T> tmp = dijkstra(end);
        tmp.path_weight += this.weight;
        return tmp;

    }
    public jNodeWeighted<T> dijkstra_v21(jNodeWeighted<T> end){
        rearrange();
        jNodeWeighted<T> tmp = dijkstra(end);
        tmp.path_weight += this.weight;
        return tmp;
    }

    public jNodeWeighted<T> not_dijkstra(T end) {
        LinkedList<jNodeWeighted<T>> remaining = new LinkedList<>();

        jNodeWeighted<T> endNode = new jNodeWeighted<>();

        /**
         * path_weight[node] -> peso del camino hacia el nodo. Todos son inifito menos init
         *
         * previous[node] -> mapa del nodo previo en el actual camino
         *
         * remaining -> priorityQueue de los nodos, cada prioridad definida por el path_weight
         */
        for(jNodeWeighted<T> n : getGraph()){
            if(n.equals(this)){
                this.path_weight = 0d;
                remaining.add(this);
            }else{
                n.path_weight = Double.MIN_VALUE;
                remaining.add(n);
            }

            if(n.data.equals(end))
                endNode = n;
        }

        Collections.sort(remaining, Collections.reverseOrder());

        while(!remaining.isEmpty()){
            jNodeWeighted<T> n= remaining.poll();

            //Of node 'n' we have the links
            for(jNodeWeighted<T> tmp : n.adj){
                Double current = tmp.path_weight;
                Double path;
                if (n.path_weight > tmp.path_weight) {
                    path = n.links.get(tmp) + n.path_weight;
                } else
                    path = tmp.path_weight;

                if(path>current){
                    tmp.path_weight = path;
                    tmp.previous = n;
                    Collections.sort(remaining,Collections.reverseOrder());
                }
            }
        }

        return endNode;
    }
    public jNodeWeighted<T> not_dijkstra(jNodeWeighted<T> end) {
        LinkedList<jNodeWeighted<T>> remaining = new LinkedList<>();

        jNodeWeighted<T> endNode = end;

        /**
         * path_weight[node] -> peso del camino hacia el nodo. Todos son inifito menos init
         *
         * previous[node] -> mapa del nodo previo en el actual camino
         *
         * remaining -> priorityQueue de los nodos, cada prioridad definida por el path_weight
         */
        for(jNodeWeighted<T> n : getGraph()){
            if(n.equals(this)){
                this.path_weight = -1d;
                remaining.add(this);
            }else{
                n.path_weight = 0d;
                remaining.add(n);
            }

        }

        Collections.sort(remaining);

        while(!remaining.isEmpty()){
            jNodeWeighted<T> n= remaining.poll();

            //Of node 'n' we have the links
            for(jNodeWeighted<T> tmp : n.adj){
                Double current = tmp.path_weight;
                Double path;
                if (n.path_weight > tmp.path_weight) {
                    path = n.links.get(tmp) + n.path_weight;
                } else
                    path = tmp.path_weight;

                if(path>current){
                    tmp.path_weight = path;
                    tmp.previous = n;
                    Collections.sort(remaining);
                }
            }
        }

        return endNode;
    }

    public void reset_visit(){
        ArrayList<jNodeWeighted<T>> graph = getGraph();
        graph.forEach((n) -> n.visit=false);
    }

    @Override
    public int compareTo(jNodeWeighted<T> tjNodeWeighted) {
        return path_weight.compareTo(tjNodeWeighted.path_weight);
    }


}
