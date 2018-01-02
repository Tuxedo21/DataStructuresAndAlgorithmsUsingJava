package interviewBit.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static int binarySearch(int [] Ar, int x){

        int low = 0;
        int high = Ar.length-1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (Ar[mid] == x)
                return mid;
            else if(Ar[mid] > x ){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        return -1;
    }

    public static int firstBinarySearch(int [] Ar, int x){

        int low = 0;
        int high = Ar.length-1;
        int result = -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (Ar[mid] == x){
                result = mid;
                high = mid -1;
            }

            else if(Ar[mid] > x ){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        return result;
    }


    public static int lastBinarySearch(int [] Ar, int x){

        int low = 0;
        int high = Ar.length -1;
        int result = -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (Ar[mid] == x){
                result = mid;
                low = mid + 1;
            }

            else if(Ar[mid] > x ){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        return result;
    }

    public static int xInSortedArray(int [] Ar, int x){

        return lastBinarySearch(Ar,x) - firstBinarySearch(Ar,x) + 1;

    }




    public static int findMin(final List<Integer> a){
        int low = 0, high = a.size()-1, N = a.size()-1;
        while (low <= high){
            if(a.get(low) <= a.get(high)) // case 1
                return a.get(low);

            int mid = (high + low) / 2;
            int next = (mid + 1) % N, prev = (mid -1 + N) % N;

            if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) // case 2
                return a.get(mid);

            else if (a.get(mid) <= a.get(high)) // case 3
                high = mid - 1;
            else if (a.get(mid) >= a.get(low)) // case 4
                low = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] Ar = new int[]{1,2,3,4,4,5,5,5,6,7,8,10,13,14,16,17};

        final ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(13);
        list.add(14);
        list.add(16);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);


        System.out.println(findMin(list));

//        System.out.println(firstBinarySearch(Ar,17));
//        System.out.println(lastBinarySearch(Ar, 17));
//        System.out.println(xInSortedArray(Ar, 17));
    }


}
