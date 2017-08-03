package JavaAlgDaSt.Chap8;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 27/02/17.
 */
public class BubbleSort {


    public static void intBubbleSort(int [] array){
        int j;                      // our counter
        boolean flag = true;        // our flag to know if there has been a swap
        int temp;                   // our temporal value that could change with 3 xor's
        int k =0;                   // My add on so every for cycle can be looked at a little bit less

        while (flag){               // If there have been no swaps, then the sort is in order
            flag = false;
            for(j = 0; j < array.length - 1 -k; j++){
                if(array[j] > array[j +1]){  // Code for swap
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag =true;
                }
            }
            k++; //We can subtract 'k' from array.length every cycle, because the largest value is now at the 'top'
        }




    }

    public static void main(String[] args) {
        RandomArray ra = new RandomArray();

        int [] array = ra.IntArray(10,-100,100);

        System.out.println(Arrays.toString(array));

        intBubbleSort(array);
        System.out.println(Arrays.toString(array));

    }





}
