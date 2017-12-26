package CtCi.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 22/09/17.
 */
public class MatrixRotation {


   static public int [][] rotate(int [][] a){
        int aux;
        int l = a.length - 1;
        for(int i=0; i < Math.ceil(a.length/2);i++){
            for(int j = i; j < l - i;j++){
                aux = a[i][j];
                a[i][j] = a[l-j][i];
                a[l-j][i] = a[l-i][l-j];
                a[l-i][l-j] = a[j][l-i];
                a[j][l-i] = aux;
            }
        }

       System.out.println("Miguel rotation");

        return a;}

    static void rotation(ArrayList<ArrayList<Integer>> a){
        int N = a.size() - 1;

        for (int i = 0; i < (N+1) / 2; i++){
            for (int j = i; j < N - i;++j){

                int temp1 = a.get(i).get(j);
                int temp2 = a.get(j).get(N-i);
                int temp3 = a.get(N-i).get(N-j);
                int temp4 = a.get(N-j).get(i);

                a.get(j).set(N-i,temp1);
                a.get(N-i).set(N-j,temp2);
                a.get(N-j).set(i,temp3);
                a.get(i).set(j,temp4);
            }
        }
        System.out.println("rotate");
    }

    static void leftRotation(ArrayList<ArrayList<Integer>> a){
        int N = a.size() -1;

        for (int i = 0; i <(N+1)/2;i++)
            for (int j = i; j < N - i; j++){
                int temp1 = a.get(i).get(j);//HighLeft
                int temp2 = a.get(j).get(N-i);//HighRight
                int temp3 = a.get(N-i).get(N-j);//LowRight
                int temp4 = a.get(N-j).get(i);//LowLeft

                a.get(N-j).set(i,temp1);
                a.get(i).set(j,temp2);
                a.get(j).set(N-i,temp3);
                a.get(N-i).set(N-j,temp4);

            }

        System.out.println("leftRotation");
    }

    public static void main(String[] args) {



        int [][] marr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        marr = rotate(marr);

        for (int [] a: marr)
            System.out.println(Arrays.toString(a));


        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        arr.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
        arr.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
        arr.add(new ArrayList<>(Arrays.asList(13,14,15,16)));


        for (ArrayList<Integer> a : arr)
            System.out.println(a.toString());

        rotation(arr);

        for (ArrayList<Integer> a : arr)
            System.out.println(a.toString());

        ArrayList<ArrayList<Integer>> arr3 = new ArrayList<>();
        arr3.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arr3.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arr3.add(new ArrayList<>(Arrays.asList(7,8,9)));

        //rotation(arr3);

        for (ArrayList<Integer> a: arr3)
            System.out.println(a);

        leftRotation(arr3);

        for (ArrayList<Integer> a: arr3)
            System.out.println(a);

        leftRotation(arr3);

        for (ArrayList<Integer> a: arr3)
            System.out.println(a);

        leftRotation(arr3);

        for (ArrayList<Integer> a: arr3)
            System.out.println(a);

        leftRotation(arr3);

        for (ArrayList<Integer> a: arr3)
            System.out.println(a);

        rotation(arr);

        for (ArrayList<Integer> a: arr)
            System.out.println(a);



    }
}
