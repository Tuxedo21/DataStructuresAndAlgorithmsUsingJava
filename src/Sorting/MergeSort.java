package Sorting;

import java.util.Arrays;


/**
 * Created by tuxedo21 on 26/10/16.
 */

//TODO lets just make the fucking arrays :v
public class MergeSort{
    public static int[] mergesort(int[] ar){
        if(ar.length <= 1){
            return ar;
        }
        //Split correctly (get valid indicies)
        int lli, lri, rli, rri;

        lli = 0;
        lri = ((ar.length-1) / 2);
        rli = lri + 1;
        rri = ar.length - 1;

        int [] A = new int[lri - lli + 1];
        int [] B = new int[rri - rli + 1];

        for (int i = 0; i < A.length;i++){
            A[i] = ar[i];
        }
        for (int j = 0; j < B.length; j++){
            B[j] = ar[rli];
            rli++;
        }

       return merge(mergesort(A), mergesort(B));
    }

    public static int[] merge(int[] A, int[] B){
        int [] C = new int[A.length + B.length]; // maybe add 1

        int ci = 0;
        int ai = 0;
        int bi = 0;

        while ( ci < C.length ){
           if(A[ai] <= B[bi]){
               C[ci] = A[ai];
               ai++;
               ci++;
               if (ai >= A.length){
                   while (bi < B.length) {
                       C[ci] = B[bi];
                       bi++;
                       ci++;
                   }
               }

           }else if(A[ai] >= B[bi]){
               C[ci] = B[bi];
               bi++;
               ci++;
               if(bi >= B.length){
                   while (ai < A.length) {
                       C[ci] = A[ai];
                       ai++;
                       ci++;
                   }
               }

           }
        }
        return C;
    }

    public static void main(String[] args) {
        //int n = (int) Math.pow(2.0,10.0);
        int [] array = Helper.randomIntArray(9,0,10);
        int [] sortedArray = mergesort(array);
        //merge(array,0,4,5,8);
        System.out.println("The output: " +Arrays.toString(sortedArray));

        int [] a = new int[1];
        System.out.println(Arrays.toString(a) +" "+ a.length);


    }


}

