package CtCi.DynamicProgramming;

/**
 * Created by tuxedo21 on 20/08/17.
 */
public class MagicIndex {

    static int magicBinarySearch(int [] ar){
        return magicBinarySearch(ar,0,ar.length-1);
    }

    static int magicBinarySearch(int [] ar, int i, int j){
        int mid = ((j - i) / 2) + i;

        if (i > j){
            return -1;
        }
        else if (mid == ar[mid])
            return mid;
        else if(ar[mid] < mid){
            return magicBinarySearch(ar, mid + 1, j);
        }
        else {
            return magicBinarySearch(ar,i, mid -1);
        }
    }


    public static void main(String[] args) {
        System.out.println(magicBinarySearch(new int[] {-40,-20,-1,1,2,3,4,5,7,10,12,13} ) +"");
    }
}
