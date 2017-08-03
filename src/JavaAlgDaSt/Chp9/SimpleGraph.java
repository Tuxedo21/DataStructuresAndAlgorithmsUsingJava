package JavaAlgDaSt.Chp9;

import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 2/03/17.
 */
public class SimpleGraph {

    Listing2 vertex[];
    int edge[][];
    int max, numberOfVertices;

    public SimpleGraph(int n){

        vertex = new Listing2[n];
        edge = new int[n][n];
        max = n;
        numberOfVertices = 0;

    }

    public boolean insertVertex (int vertexNumber, Listing2 newListing){
        if(vertexNumber >= max) // The Graph is full.
            return false;
        vertex[vertexNumber] = newListing.deepCopy();
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
