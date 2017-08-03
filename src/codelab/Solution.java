package codelab;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int nextFive;
        for(int i = 0; i < grades.length; i++){

            if(grades[i] > 37){//alter grade
                nextFive = grades[i] - ((grades[i] / 10) * 10);
                System.out.println(nextFive+"::Int Five");

                if(nextFive == 3 || nextFive == 4){
                    nextFive = ((grades[i] / 10) * 10) +5;
                    System.out.println(nextFive+"::Next Five 5 ");

                        grades[i] = nextFive;

                }else if((nextFive == 8 || nextFive == 9)){
                    nextFive = ((grades[i] / 10) * 10) +10;
                    System.out.println(nextFive+"::Next Five 10");
                        grades[i] = nextFive;

                }
            }
       }
        return grades;
    }

    public static void main(String[] args) {
        int[] anArray = {73, 67, 38, 33};
        int[] result = solve(anArray);
        System.out.println("TEXT");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("\nTEXT 2");
    }
}