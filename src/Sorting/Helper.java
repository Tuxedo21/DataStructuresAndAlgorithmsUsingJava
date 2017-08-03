package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


/**
 * Created by tuxedo21 on 26/10/16.
 */
public class Helper {

    public static int[] randomIntArray(int len,int min, int max){

        int[] temp = new int[len];
        Random rand = new Random();
        for(int i = 0; i < len; i++){
            temp[i] = rand.nextInt((max - min) + 1) + min;
        }
        System.out.println("Your input: " +Arrays.toString(temp));

        return temp;
    }


}
