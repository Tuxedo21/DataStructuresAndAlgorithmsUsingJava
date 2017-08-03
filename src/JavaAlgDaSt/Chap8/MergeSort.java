package JavaAlgDaSt.Chap8;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 1/03/17.
 */
public class MergeSort {


    public static void intMergeSort(int [] items, int [] temp, int leftIndex, int rightIndex){

        int nItems = rightIndex - leftIndex +1;
        if(nItems == 1)
          return;
        int middleIndex = (rightIndex + leftIndex) /2;

        intMergeSort(items,temp,leftIndex,middleIndex);
        intMergeSort(items,temp,middleIndex + 1, rightIndex);

        intMerge(items,temp,leftIndex,middleIndex+1,rightIndex);
        return;
    }

    public static void intMerge(int [] items, int [] temp, int leftIndex, int middleIndex, int rightIndex){
        int leftEnd, nItems,tempIndex;
        tempIndex =leftIndex;
        leftEnd = middleIndex -1;
        nItems = rightIndex - leftIndex + 1;
        while (leftIndex <= leftEnd && middleIndex <= rightIndex){
            if(items[leftIndex] <= items[middleIndex]){
                temp[tempIndex] = items[leftIndex];
                leftIndex++;
                tempIndex++;

            }else {
                temp[tempIndex] = items[middleIndex];
                middleIndex++;
                tempIndex++;
            }
        }// end while

        if(leftIndex <= leftEnd){
            while (leftIndex <= leftEnd){
                temp[tempIndex] = items[leftIndex];
                leftIndex++;
                tempIndex++;
            }
        }else {
            while (middleIndex <= rightIndex){
            temp[tempIndex] = items[middleIndex];
            middleIndex++;
            tempIndex++;}
        }

        for( int i = 0; i < nItems;i++){
            items[rightIndex] = temp[rightIndex];
            rightIndex--;
        }
    }



    public static void main(String[] args) {
        RandomArray ra = new RandomArray();

        int [] array = ra.IntArray(16,-100,100);
        int [] temp = new int [16];

        System.out.println(Arrays.toString(array));

        intMergeSort(array, temp,0, array.length-1);
        System.out.println(Arrays.toString(array));

    }
}
