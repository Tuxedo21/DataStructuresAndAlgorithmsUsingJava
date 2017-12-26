//package MyDataStructures;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Problems {
//
//    public void security(){
//
//        File f = new File("/home/urb/IdeaProjects/Contest/src/test_security");
//        int n,m;
//        String line, key, knode;
//        String []lineNode;
//        HashMap<String,NodeHierarchy<String,Double>> map = new HashMap<>();
//
//        try {
//            Scanner scan = new Scanner(f);
//
//            n = scan.nextInt();
//            m = scan.nextInt();
//            scan.nextLine();
//
//            boolean direct,pass=true;
//
//
//
//            /*
//            for(int i=0;i<n;++i){
//
//                NodeHierarchy<String,Double> node = new NodeHierarchy<>();
//                line = scan.nextLine();
//                node.key = line.substring(0,line.indexOf(':'));
//
//                line = line.substring(line.indexOf(':')+1,line.length());
//                lineNode = line.split(";");
//
//                if(!map.containsKey(node.key)){
//                    map.put(node.key,node);
//                }else{
//                    node = map.get(node.key);
//                }
//
//                for(String s : lineNode){
//                    NodeHierarchy<String,Double> node2 = new NodeHierarchy<>();
//
//                    Pair<String,Double> pair = new Pair<>(s,-1d);
//                    node.adj.add(pair);
//
//                    if(!map.containsKey(s)){
//                        node2.key = s;
//                        node2.parent = node.key;
//                        map.put(s,node2);
//                    }
//                }
//            }
//
//
//
//
//
//            for(int i=0;i<m;++i){
//
//                NodeHierarchy<String,Double> init;
//
//                line = scan.nextLine();
//                key = line.substring(0,line.indexOf(';'));
//                knode = line.substring(line.indexOf(';')+1,line.length());
//
//                init = map.get(key);
//
//                System.out.println("-----");
//                System.out.println(key);
//                System.out.println(knode);
//                if(init!=null){
//                    System.out.println(init.parent);
//
//                    init = map.get(init.parent);
//                    if(init!=null){
//                        System.out.println(init.key);
//                    }
//                }
//
//
//                if(init==null) continue;
//
//                pass = true;
//                //todo da null aqui, verificar grafo
//                if(init.parent.equals(knode)){
//                    System.out.println("Yes (direct)");
//                }
//                else{
//                    while(init.parent !=null){
//
//                        init = map.getOrDefault(init.parent,null);
//
//                        if(init==null){
//                            pass=false;
//                            break;
//                        }
//                        pass=false;
//                        if(init.parent.equals(knode)){
//                            pass=true;
//                            break;
//                        }
//
//
//                    }
//
//                    //todo check this shit
//
//                    if(pass)
//                        System.out.println("Yes (indirect)");
//                    else
//                        System.out.println("No");
//                }
//
//
//
//            }
//*/
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//
//    }
//
//    public void rockpaper(){
//        String tmp,name,name2,q1,q2;
//        long max = 100000,count = 1, win1=0,win2=0;
//        StringBuilder builder = new StringBuilder();
//
//        File f = new File("/home/urb/IdeaProjects/Contest/src/test2");
//
//        try {
//            Scanner scan = new Scanner(f);
//            tmp = scan.nextLine();
//            name = tmp.substring(0,tmp.indexOf(':'));
//            q1 = tmp.substring(tmp.indexOf(':')+1,tmp.length());
//
//            tmp = scan.nextLine();
//            name2 = tmp.substring(0,tmp.indexOf(':'));
//            q2 = tmp.substring(tmp.indexOf(':')+1,tmp.length());
//
//
//            int i=0,j=0;
//            while(count<max){
//                ++count;
//                if(i==q1.length()) i=0;
//                if(j==q2.length()) j=0;
//
//                //R P S     PR  RS  SP
//                builder.append(q1.charAt(i));
//                builder.append(q2.charAt(i));
//                tmp = builder.toString();
//
//
//                System.out.println(tmp);
//
//
//                if(tmp.equals("PR") || tmp.equals("RS") || tmp.equals("SP")){
//                    win1++;
//                    win2--;
//                }else if(tmp.equals("RR") || tmp.equals("PP") || tmp.equals("SS")){
//
//                }
//                else{
//                    win1--;
//                    win2++;
//                }
//                System.out.println(win1 +  "," +win2);
//
//                i++;
//                j++;
//
//
//                if(win1==5 || win2==5)
//                    break;
//
//
//                builder = new StringBuilder();
//            }
//
//            if(win1==5){
//                System.out.println(count);
//                System.out.println(name);
//            }else if(win2 ==5){
//                System.out.println(count);
//                System.out.println(name2);
//            }else
//                System.out.println(":DRAW:");
//
////                builder.append(scan.next());
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//
//
//
//    public void testGraph(){
//        jNode<Integer> node1 = new jNode<>(1);
//        jNode<Integer> node2 = new jNode<>(2);
//        jNode<Integer> node3 = new jNode<>(3);
//        jNode<Integer> node4 = new jNode<>(4);
//        jNode<Integer> node5 = new jNode<>(5);
//        jNode<Integer> node6 = new jNode<>(6);
//        jNode<Integer> node7 = new jNode<>(7);
//        jNode<Integer> node8 = new jNode<>(8);
//        jNode<Integer> node9 = new jNode<>(9);
//
//
//        node1.add(node2);
//        node1.add(node4);
//        node2.add(node3);
//        node2.add(node4);
//        node3.add(node2);
//        node4.add(node6);
//        node4.add(node5);
//        node5.add(node9);
//        node6.add(node7);
//        node7.add(node8);
//        node7.add(node2);
//        node8.add(node6);
//        node8.add(node3);
//
//
//        ArrayList<jNode<Integer>> graph = node1.getGraph();
//
//        for(jNode<Integer> n : graph){
//            System.out.println(n.data);
//        }
//
//    }
//
//    public void testGraph2(){
//        jNodeWeighted<Integer> node1 = new jNodeWeighted<>(1);
//        jNodeWeighted<Integer> node2 = new jNodeWeighted<>(2);
//        jNodeWeighted<Integer> node3 = new jNodeWeighted<>(3);
//        jNodeWeighted<Integer> node4 = new jNodeWeighted<>(4);
//        jNodeWeighted<Integer> node5 = new jNodeWeighted<>(5);
//        jNodeWeighted<Integer> node6 = new jNodeWeighted<>(6);
//        jNodeWeighted<Integer> node7 = new jNodeWeighted<>(7);
//        jNodeWeighted<Integer> node8 = new jNodeWeighted<>(8);
//        jNodeWeighted<Integer> node9 = new jNodeWeighted<>(9);
//
//
//        node1.add(node2,1d);
//        node1.add(node4,2d);
//        node2.add(node3,1d);
//        node2.add(node4,3d);
//        node3.add(node2,2d);
//
//        node4.add(node6,1d);
//        node4.add(node5,2d);
//
//
//        node5.add(node9,3d);
//        node6.add(node7,3d);
//        node7.add(node8,2d);
//        node7.add(node2,4d);
//        node8.add(node6,10d);
//        node8.add(node3,2d);
//
//        jNodeWeighted<Integer> res = node8.dijkstra(6);
//
//        System.out.println(res.path_weight);
//
//        jNodeWeighted<Integer> res2 = node8.not_dijkstra(6);
//        System.out.println(res2.path_weight);
//
//
//
//        System.out.println(res2.data);
////        System.out.println(res.path_weight);
//
//
//
//    }
//
//    public void testGraph3(){
//        jNodeWeighted<String> A = new jNodeWeighted<>();
//        jNodeWeighted<String> B = new jNodeWeighted<>();
//        jNodeWeighted<String> C = new jNodeWeighted<>();
//        jNodeWeighted<String> D = new jNodeWeighted<>();
//        jNodeWeighted<String> E = new jNodeWeighted<>();
//        jNodeWeighted<String> F = new jNodeWeighted<>();
//        jNodeWeighted<String> G = new jNodeWeighted<>();
//        jNodeWeighted<String> H = new jNodeWeighted<>();
//
//
//        A.add(B,20d);
//        A.add(D,80d);
//        A.add(G,90d);
//        B.add(F,10d);
//        C.add(H,20d);
//        C.add(F,50d);
//        C.add(D,10d);
//        D.add(G,20d);
//        D.add(C,10d);
//        E.add(B,50d);
//        E.add(G,30d);
//        F.add(C,10d);
//        F.add(D,40d);
//        G.add(A,20d);
//
//
//        jNodeWeighted<String> res = A.dijkstra(D);
//        System.out.println(res.path_weight);
////        System.out.println(res.path_weight);
//
//
//
//    }
//
//    public void testGraph4(){
//        jNodeWeighted<Integer> n1 = new jNodeWeighted<>(1);
//        jNodeWeighted<Integer> n2 = new jNodeWeighted<>(2);
//        jNodeWeighted<Integer> n3 = new jNodeWeighted<>(3);
//
//        n1.add(n2,10d);
//        n1.add(n3,1d);
//
//        n2.add(n1,10d);
//        n2.add(n3,1d);
//
//        n3.add(n1,1d);
//        n3.add(n2,1d);
//
//
//        jNodeWeighted<Integer> res = n1.dijkstra(n2);
//
//        System.out.println(res.path_weight);
//
//        res.reset_visit();
//
//        res = n1.not_dijkstra(n3);
//        System.out.println(res.path_weight);
//
//    }
//
//    public void testCube(){
//        jNodeWeighted<String> n1 = new jNodeWeighted<>("1",3d);
//        jNodeWeighted<String> n2 = new jNodeWeighted<>("2",4d);
//        jNodeWeighted<String> n3 = new jNodeWeighted<>("3",7d);
//        jNodeWeighted<String> n4 = new jNodeWeighted<>("4",3d);
//        jNodeWeighted<String> n5 = new jNodeWeighted<>("5",4d);
//        jNodeWeighted<String> n6 = new jNodeWeighted<>("6",1d);
//        jNodeWeighted<String> n7 = new jNodeWeighted<>("7",0d);
//        jNodeWeighted<String> n8 = new jNodeWeighted<>("8",2d);
//
//
//
//        n1.add(n2,0d);
//        n1.add(n3,0d);
//        n1.add(n5,0d);
//
//        n2.add(n1,0d);
//        n2.add(n4,0d);
//        n2.add(n6,0d);
//
//        n3.add(n1,0d);
//        n3.add(n4,0d);
//        n3.add(n7,0d);
//
//        n4.add(n2,0d);
//        n4.add(n3,0d);
//        n4.add(n8,0d);
//
//        n5.add(n1,0d);
//        n5.add(n6,0d);
//        n5.add(n7,0d);
//
//        n6.add(n5,0d);
//        n6.add(n2,0d);
//        n6.add(n8,0d);
//
//        n7.add(n5,0d);
//        n7.add(n3,0d);
//        n7.add(n8,0d);
//
//        n8.add(n7,0d);
//        n8.add(n4,0d);
//        n8.add(n6,0d);
//
//
//        jNodeWeighted<String> res = n3.dijkstra_v21(n6);
//
//        System.out.println(res.path_weight);
//
//        jNodeWeighted<String> tmp = res;
//
//        while(tmp!=null){
//            System.out.println(tmp.data);
//            tmp = tmp.previous;
//        }
//
//    }
//}
