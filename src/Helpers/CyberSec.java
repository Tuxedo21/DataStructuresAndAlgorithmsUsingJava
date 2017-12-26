package Helpers;

import JavaAlgDaSt.Chap2.Node;
import Sorting.Helper;
import com.sun.deploy.net.proxy.pac.PACFunctionsImpl;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by tuxedo21 on 26/08/17.
 */
public class CyberSec {


    static void searchNode(NodeG<String,Double> root, HashMap<String,NodeG<String,Double>> map,String data){

        LinkedList<NodeG<String,Double>> queue = new LinkedList<>();
        boolean direct = true;

        queue.add(root);





        while(!queue.isEmpty()){
            NodeG<String,Double> node = queue.pop();

            if(node.key == data){


            }


        }




    }

    public static void main(String[] args) throws IOException {


        ArrayList<String> data =  ReadData.readData();
        HashMap<String, NodeG<String ,Double>> graph = new HashMap<>();

        //CREATE HASHMAP
        for (int i = 1; i < Integer.parseInt(data.get(0).split(" ")[0]); i++){
            String[] renglon = data.get(i).split(":");
            String[] hijos = renglon[1].split(";");
            graph.put(renglon[0],new NodeG<>(renglon[0]));
            for (String s : hijos){
                if (!graph.containsKey(s)){
                    NodeG<String,Double> node = new NodeG<>();
                    node.key = s;
                    node.adj.add(new Pair<>(renglon[0],0d));
                    graph.put(s,node);
                }else {
                    NodeG<String,Double> nodeG = graph.get(s);
                    nodeG.adj.add(new Pair<>(renglon[0],0d));
                }
            }
        }

        for (int i = Integer.parseInt(data.get(0).split(" ")[0]) + 1; i < Integer.parseInt(data.get(0).split(" ")[0]) + Integer.parseInt(data.get(0).split(" ")[1]); i++){

            String[] line = data.get(i).split(";");
            String N = line[0];
            String PF= line[1];



        }
        System.out.println(graph.toString());
        System.out.println(data.toString());


    }

}
