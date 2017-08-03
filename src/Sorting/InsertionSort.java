package Sorting;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 29/10/16.
 */
public class InsertionSort {

//    public static void insertionsort(int [] ar){
//        int key,j;
//        for(int i = 1; i < ar.length; i++) {
//            j = i - 1;
//            key = ar[i];
//            while(j > 0 && ar[j] > ){
//
//            }
//        }
//
//    }

    public static void main(String[] args) {
        int[] n = Helper.randomIntArray(50,1000,0);
        //insertionsort(n);
        System.out.println("Your output:" + Arrays.toString(n));
    }
}
