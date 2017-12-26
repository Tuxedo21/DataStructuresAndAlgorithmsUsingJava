package CtCi.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 14/04/17.
 */
public class ZeroMatrix {

    public static class MyPoint{
        public int x;
        public int y;

        public MyPoint(int x, int y){
            this.x = x;
            this.y = y;

        }
    }

    static void zeroMatrix(int [][] matrix){
        ArrayList<MyPoint> points = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    points.add(new MyPoint(i,j));
                }
            }
        }


        if(points.isEmpty())
            return;
        for(MyPoint p: points){
            for(int i = 0; i < matrix.length; i++)
                matrix[i][p.y] = 0;

            for(int j =0; j < matrix[0].length; j++)
                matrix[p.x][j] = 0;
        }
    }


    public static void main(String[] args) {

        int [][] m = new int[5][6];

        for(int i=0; i < m.length; i++) {
            for(int j=0; j<m[0].length; j++) {
                m[i][j] = 1;

            }
        }

        m[2][1] = 0;
        m[0][0] = 0;

        for(int i =0; i < m.length; i++){
        System.out.println(Arrays.toString(m[i]));}

        zeroMatrix(m);
        System.out.println("");

        for(int i =0; i < m.length; i++){
            System.out.println(Arrays.toString(m[i]));}
    }

}
