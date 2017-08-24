package CtCi.SortingAndSearching;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 20/08/17.
 */
public class SortedMatrixSearch {

    public static void main(String[] args) {
        int [][] matrix = new int [10][10];
        int j =0 ;
        for (int[] row : matrix){
            for (int i = 0; i < row.length; i++){
                row[i] = j;
                j+=3;
            }
        }

        for (int [] row : matrix){
            System.out.println(Arrays.toString(row));
        }


    }
}
