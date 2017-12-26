package Sorting;

import java.util.ArrayList;
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

    static public ArrayList<String> fizzBuzz(int A) {


        if (!(A > 0))
            return null;

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= A; i++){
            if (i % 3 == 0 && i % 5 ==0)
                arr.add("FizzBuzz");
            else if(i % 3 == 0)
                arr.add("Fizz");
            else if(i % 5 ==0)
                arr.add("Buzz");
            else
                arr.add(i+"");

        }

        return arr;
    }

    static public int lengthOfLastWord(final String a) {


        if(a.matches(" +"))
            return 0;
        String[] arr = a.split(" ");
        String last = arr[arr.length-1];
        return last.length();

    }

    static public String longestCommonPrefix(ArrayList<String> a) {
        String answer = "";
        char tmp1 = 0,tmp2; // this might be a problem
        int maxLength = Integer.MAX_VALUE;
        boolean add = true;

        for (String s : a) {
            if (s.length() < maxLength)
                maxLength = s.length();
        }

        if (a.size() == 1)
            return a.get(0);

        for(int j = 0; j < maxLength; j++ ){
            add = true;
            for (int i = 0; i < a.size() - 1; i++){
                tmp1 = a.get(i).charAt(j);
                tmp2 = a.get(i+1).charAt(j);

                if(!(tmp1 - tmp2 == 0)) {
                    add = false;
                    break;
                }
            }
            if (add)
                answer = answer + tmp1;
        }

        return answer;
    }

    static public String convert(String a, int b) {

        if(b == 1)
            return a;

        int n = b;
        int m = a.length();

        char [][] zigzag = makeZigzag(n,m,a);

        return zigzagToString(zigzag);
    }

    private static String zigzagToString(char[][] zigzag) {
        String mod = "";

        for (char [] a: zigzag) {
           for (char b: a){
               if (b != Character.MIN_VALUE){
                mod = mod + b;
               }
           }

        }

        return mod;
    }

    private static char[][] makeZigzag(int n, int m, String word) {
        char[][] zigzag = new char[n][m];

        int row = 0;
        int col = 0;
        boolean down = false; // since we start at the top

        for (char a: word.toCharArray()){
            zigzag[col][row] = a;
            row++;
            if (col == n -1 || col == 0)
                down = !down;

            if (down)
                col++;
            else
                col--;
        }

//        for (char [] a: zigzag)
//            System.out.println(Arrays.toString(a));

        return zigzag;
    }


    public static void main(String[] args) {
//        int[] n = Helper.randomIntArray(10,100000000,0);
//        System.out.println("Your output:" +Arrays.toString(bubblesort(n)));
        //System.out.println(fizzBuzz(1).toString());
        //System.out.println(lengthOfLastWord("hello world"));
        ArrayList<String> a = new ArrayList<>();
        a.add("abcd"); //a.add("abcd");
       // a.add("efgh");
        System.out.println(convert("PAYPALISHIRING",3));

        //PAHNAPLSIIGYIR
        //PAHNAPLSIIGYIR
    }
}
