package Sorting;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 29/10/16.
 */
public class BubbleSort {

    public static int[] bubblesort(int[] array){
        boolean swap = false;
        for (int i = 0; i < array.length -1; i++){
            if (array[i] > array[i+1]){
                array[i] = array[i] ^ array[i+1];
                array[i+1] = array[i+1] ^ array[i];
                array[i] = array[i] ^ array[i+1];
                swap = true;
            }
        }

        if (swap){
            bubblesort(array);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] n = Helper.randomIntArray(10,100000000,0);
        System.out.println("Your output:" +Arrays.toString(bubblesort(n)));
    }
}
