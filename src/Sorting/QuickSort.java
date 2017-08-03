package Sorting;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 29/10/16.
 */
public class QuickSort {


    public static void quicksort(int[] n,int l, int r){


        int pivot = n[l];
        int left = l;
        int right = r;

        while (left < right) {

            while (n[left] <= pivot && left < right) {
                left++;
            }
            while ( n[right] > pivot) {
                right--;
            }

            if (left < right){
               int tmp = n[left]; // swap left and right values
                n[left] = n[right];
                n[right] = tmp;
            }
            System.out.println("pivot: "+pivot+" right: "+right+" left: "+left);
            System.out.println("Your output:" + Arrays.toString(n));
        }

        n[l] = n[right]; //swap the pivot value with the right value
        n[right]=pivot;

        if(l<right-1){
            quicksort(n,l,right-1); //n: array object, l: original left index, right-1: new right index
        }if (right+1<r){
            quicksort(n,right+1,r);//n: array object, right+1: new left index, r: original right index
        }

    }

    public static void main(String[] args) {
        int[] n = Helper.randomIntArray(1000,1000,0);
        quicksort(n,0,n.length-1);
        System.out.println("Your output:" + Arrays.toString(n));
    }
}
