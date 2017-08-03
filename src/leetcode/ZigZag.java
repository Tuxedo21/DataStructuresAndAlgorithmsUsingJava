package leetcode;

/**
 * Created by tuxedo21 on 19/12/16.
 *
 *

 PAYPALISHIRING

                                        THIS IS ALL BAD!!!!!!!!!!

 P   A   H   N
 A P L S I I G
 Y   I   R

 *
 *
 *
 */
public class ZigZag {

    static String convert(String str, int nRows){

        int nCols = ( str.length() / 2 ) + 1;

        if(nRows == 1){
            nCols = str.length();
        }

        String A[][] = new String[nRows][nCols];
        System.out.println("m: "+ nRows +", n: "+ nCols);

        int i =0; //x
        int j =0; //y
        int k =0;

        while (k < str.length()){

           if(i > nCols ){
               i=1;
               j++;
               A[i][j] = String.valueOf(str.charAt(k));
               j++;
               i=0;
           }else {
               A[i][j] = String.valueOf(str.charAt(k));
               i++;
           }
            k++;
        }
        String strZigZag = "";
        for (int x = 0; x < nRows; x++){
            for (int y =0; y < nCols; y++){
                if(  !(A[x][y] == null ))
                    strZigZag += A[x][y];
            }
        }



        return strZigZag;
    }

    public static void main(String[] args) {
        String text = "AB";
        int nRows = 1;
        String string = convert( text,  nRows);
        System.out.println(string);
    }

}
