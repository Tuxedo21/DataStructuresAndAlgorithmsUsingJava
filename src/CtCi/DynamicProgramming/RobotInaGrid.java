package CtCi.DynamicProgramming;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 20/08/17.
 */
public class RobotInaGrid {

   static ArrayList<Point> getPath(int [][] maze){
       if (maze == null) return null;
       ArrayList<Point> points = new ArrayList<>();
       getPath(maze,maze.length-1,maze[0].length-1,points);
       return points;
   }

   static boolean getPath(int[][] maze, int row, int col, ArrayList<Point> path){
       // base case
       if (row < 0 || col < 0 || maze[row][col] == 0) return false;
       // Asks if your done (at the origin) or if you can go up or to the left, if so it adds the point and
       if ((row == 0 && col == 0) || getPath(maze,row-1,col,path) || getPath(maze, row, col-1, path)){
           Point p = new Point(row,col);
           path.add(p);
           return true;
       }
       return false;
   }


    public static void main(String[] args) {
        int [][] matrix = new int [10][10];

        for (int [] row : matrix){
            Arrays.fill(row,1);
        }
        matrix[2][3] = 0;        matrix[5][3] = 0;        matrix[6][4] = 0;        matrix[4][4] = 0;
        matrix[1][7] = 0;        matrix[1][6] = 0;        matrix[9][0] = 0;        matrix[0][9] = 0;
        matrix[0][8] = 0;        matrix[0][7] = 0;        matrix[0][6] = 0;        matrix[0][5] = 0;
        matrix[0][4] = 0;


        for (int [] row : matrix){
            System.out.println(Arrays.toString(row));
        }

        ArrayList<Point> points =  getPath(matrix);
        System.out.println(points.toString());

    }

}
