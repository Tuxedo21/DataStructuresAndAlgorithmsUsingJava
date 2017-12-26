package CtCi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by tuxedo21 on 4/11/16.
 */
public class Fibonacci {

    public static int fibo(int n){

        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else if(n > 1){
            return fibo(n -1) + fibo(n -2);
        }
        else {
            return 0;
        }

    }

    public static int fiboM(int n){
        int[] memo = new int[n+1];
        return fiboM(n,memo);

    }

    public static int fiboM(int n, int [] memo){
        if(n == 0 || n == 1)
            return 1;
        else if(memo[n] > -1)
            return memo[n];
        else{
            memo[n] = fiboM(n-1,memo) + fiboM(n-2,memo);
            return memo[n];
        }
    }

    static public ArrayList<ArrayList<Integer>> generateMatrix(int a) {


        int T = 0;
        int B = a - 1;
        int R = a - 1;
        int L = 0;

        int num = 1;
        int dir = 0;

        //int [][] arr = new int[a][a];
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < a;i++){
            arr.add(new ArrayList<>(Collections.nCopies(a,0)));

        }


        while(L <= R && T <= B){

            if(dir ==0){
                for(int i = L; i <=R; i++){
                    arr.get(T).set(i,num); //A.get(i).set(j,val);
                    num++;
                }
                T++; dir = 1;
            }
            else if(dir ==1){
                for(int i = T; i <=B; i++){
                    arr.get(i).set(R,num);//arr[i][R] = num;
                    num++;
                }
                R--; dir = 2;
            }
            else if(dir ==2){
                for(int i = R; i >=L; i--){
                    arr.get(B).set(i,num);//arr[B][i] = num;
                    num++;
                }
                B--; dir = 3;
            }
            else if(dir ==3){
                for(int i = B; i >=T; i--){
                    arr.get(i).set(L,num);//arr[i][L] = num;
                    num++;
                }
                L++; dir = 0;
            }
        }


        return arr;
    }

    public static void main(String[] args) {
       // for (int i = 1; i < 45; i++)
       //     System.out.println(fibo(i) + " : " +i);

      //  System.out.println(fibo(46));


        System.out.println(Math.max(-500,Integer.MIN_VALUE));
        System.out.println(-500 > Integer.MIN_VALUE);
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(-163); arr.add(-20);


        Integer fmax = Integer.MIN_VALUE;
        Integer cmax = 0;

        for(int i =0;i<arr.size();i++){
            cmax+=arr.get(i);
            if(fmax < cmax)
                fmax = cmax;
            if (cmax < 0)
                cmax = 0;
        }

        System.out.println(fmax);
        System.out.println(arr.size());




        ArrayList<ArrayList<Integer>> arrayList = generateMatrix(2);

        for (ArrayList a: arrayList){
            System.out.println(a.toString());
        }

}


}
