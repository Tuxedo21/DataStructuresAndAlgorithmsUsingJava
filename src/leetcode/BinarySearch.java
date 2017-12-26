package leetcode;

import java.util.ArrayList;

/**
 * Created by tuxedo21 on 14/11/17.
 */
public class BinarySearch {


    static int bSearch(ArrayList<Integer> a,int start, int end, int elem){

        if (end < start)
            return -1;

        int mid = ((start + end) / 2);

        if (elem == a.get(mid))
            return mid;

        else if(elem < a.get(mid)) // right
            return bSearch(a,start,mid -1 ,elem);

        else
            return bSearch(a,mid+1,end,elem); //left

    }
 //Summer School on Speech and Language Technology

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int N = 123;
        for (int i = 0; i < N; i+=2){
            arr.add(i);
        }
        System.out.println(arr.toString());
        System.out.println(bSearch(arr,0,arr.size()-1,0));
        System.out.println(bSearch(arr,0,arr.size()-1,78) +" " + arr.get(bSearch(arr,0,arr.size()-1,78)));
        System.out.println(bSearch(arr,0,arr.size()-1,79) +" " + arr.get(bSearch(arr,0,arr.size()-1,78)));
        System.out.println(bSearch(arr,0,arr.size()-1,-10));
        System.out.println(bSearch(arr,0,arr.size()-1,100));

    }
}
