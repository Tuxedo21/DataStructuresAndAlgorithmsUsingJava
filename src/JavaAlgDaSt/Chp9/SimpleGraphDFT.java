package JavaAlgDaSt.Chp9;


import JavaAlgDaSt.Chap4.Listing2;
import JavaAlgDaSt.Chp9.SimpleGraph;

import java.util.Stack;

/**
 * Created by tuxedo21 on 4/03/17.
 */
public class SimpleGraphDFT {

    Listing2 vertex[];  // Where we store the Nodes
    int edge[][];       // Reference to the adjacency matrix array
    int max, numberOfVertices;

    public SimpleGraphDFT(int n){
        vertex = new Listing2[n];
        edge = new int[n][n];
        max = n; numberOfVertices = 0;
    }

    public void DFT(int firstVertex){
        int v;
        Stack<Integer> stack = new Stack();
        // Initialize all vertices to not visited
        for( int i = 0; i < vertex.length; i++){
            if(vertex[i] != null)
                vertex[i].setPushed(false);
        }
        stack.push(firstVertex);
        vertex[firstVertex].setPushed(true);

        while (!stack.isEmpty()){

            v = stack.pop();
            vertex[v].visit();
            for(int column = 0; column < numberOfVertices; column++){
                if(edge[v][column] == 1 && !vertex[column].getPushed()){
                    stack.push(column);
                    vertex[column].setPushed(true);  // This is what makes it impossible to visit nodes twice
                } // end if
            } // end for
        } // end while
    }

    public boolean insertVertex (int vertexNumber, Listing2 newListing){
        if(vertexNumber >= max) // The Graph is full.
            return false;
        vertex[vertexNumber] = newListing.deepCopy();
        numberOfVertices++;
        return true;
    }

    public boolean insertEdge(int fromVertex, int toVertex){
        if(vertex[fromVertex] == null || vertex[toVertex] == null)
            return false; // Nonexisten vertex
        edge[fromVertex][toVertex] = 1;
        return true;
    }

    public void showVertex(int vertexNumber){
        System.out.println(vertex[vertexNumber]);
    }

    public void showEdges(int vertexNumber){
        for (int column = 0; column < numberOfVertices; column++){
            if(edge[vertexNumber][column] == 1)
                System.out.println(vertexNumber+","+column);
        }
    }

}
