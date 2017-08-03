package CtCi.TreesAndGraphs;


/**
 * Created by tuxedo21 on 3/08/17.
 */
public class SimpleGraph {


    gNode vertex[];
    int edge[][];
    int max, numberOfVertices;

    public SimpleGraph(int n){
        vertex = new gNode[n];
        edge = new int[n][n];
        max = n;
        numberOfVertices = 0;

    }

    public boolean insertVertex (int vertexNumber, gNode node){
        if(vertexNumber >= max) // The Graph is full.
            return false;
        vertex[vertexNumber] = node.deepCopy();
        numberOfVertices++;
        return true;
    }

    public boolean insertEdge(int fromVertex, int toVertex){
        if(vertex[fromVertex] == null || vertex[toVertex] == null){
            return false; // Nonexisten vertex
        }
        edge[fromVertex][toVertex] = 1;
        return true;
    }

    public void showVertex(int vertexNumber){
        for (int column = 0; column < numberOfVertices;column++){
            if(edge[vertexNumber][column] == 1){
                System.out.println(vertexNumber+","+column);
            }
        }
    }

    public void showEdges(int vertexNumber){
        for (int column = 0; column < numberOfVertices; column++){
            if(edge[vertexNumber][column] == 1)
                System.out.println(vertexNumber+","+column);
        }
    }

}