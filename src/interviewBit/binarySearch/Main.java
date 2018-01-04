package interviewBit.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static int binarySearch(final List<Integer> a, int x,int low,int high){


        while (low <= high){
            int mid = (low + high) / 2;
            if (a.get(mid) == x)
                return mid;
            else if(a.get(mid) > x )
                high = mid-1;
            else
                low = mid+1;
        }

        return -1;
    }

    public static int firstBinarySearch(final List<Integer> Ar, int x){

        int low = 0,high = Ar.size()-1,result = -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (Ar.get(mid) == x){
                result = mid;
                high = mid -1;
            }
            else if(Ar.get(mid) > x )
                high = mid-1;
            else
                low = mid+1;
        }
        return result;
    }

    public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(firstBinarySearch(a,b));
        arrayList.add(lastBinarySearch(a,b));
        return arrayList;

    }


    public static int lastBinarySearch(final List<Integer> Ar, int x){

        int low = 0, high = Ar.size() -1, result = -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (Ar.get(mid) == x){
                result = mid;
                low = mid + 1;
            }
            else if(Ar.get(mid) > x )
                high = mid-1;
            else
                low = mid+1;
            }
        return result;
    }

//    public static int xInSortedArray(int [] Ar, int x){
//
//        return lastBinarySearch(Ar,x) - firstBinarySearch(Ar,x) + 1;
//
//    }




    public static int findMin(final List<Integer> a){
        int low = 0, high = a.size()-1, N = a.size()-1;
        while (low <= high){
            if(a.get(low) <= a.get(high)) // case 1
                return low;

            int mid = (high + low) / 2;
            int next = (mid + 1) % N, prev = (mid -1 + N) % N;

            if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) // case 2
                return mid;

            else if (a.get(mid) <= a.get(high)) // case 3
                high = mid - 1;
            else if (a.get(mid) >= a.get(low)) // case 4
                low = mid + 1;
        }
        return -1;
    }

    public static int searchForMinIndex(final List<Integer> a) {

        int low = 0, high = a.size()-1, N = a.size()-1;

        while (low <= high){
            if (a.get(low) <= a.get(high))//case 1
                return low;

            int mid = (high + low) / 2;
            int next = (mid + 1) % N, prev = (mid - 1 + N) % N;
            if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev))//case 2
                return mid;

            else if (a.get(mid) <= a.get(high)) // case 3
                high = mid - 1;
            else if (a.get(mid) >= a.get(low)) // case 4
                low = mid + 1;

        }
        return -1;
    }

    public static int search(final List<Integer> a, int b) {

        int pivot = searchForMinIndex(a);

        if (a.get(pivot) == b)
            return pivot;

        else if (pivot == 0) // normal Binary Search
            return binarySearch(a,b,0,a.size()-1);

        else if (a.get(pivot) < b && b <= a.get(a.size()-1))// right side Binary Search
            return binarySearch(a,b, pivot,a.size()-1);

        else //  left side Binary Search
            return binarySearch(a,b,0,pivot-1);

    }

    public static int sqrt(int A) { // omg this is genius, totally had a brain fart and thought I had to use an array.


        int low, high, root;
        int mid;

        low = 1;
        high = A;
        root = 0;

        while (low <= high) {

            mid = (low + high) / 2;

            if (mid == A / mid && (A % mid == 0))
                return mid;

            if (mid <= A / mid) {
                root = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return root;

    }




    public static void main(String[] args) {
        int [] Ar = new int[]{1,2,3,4,4,5,5,5,6,7,8,10,13,14,16,17};

        final ArrayList<Integer> list = new ArrayList<>();

        list.add(5); // 0
        list.add(7); // 1
        list.add(7); // 2
        list.add(8); // 3
        list.add(8);  // 4
        list.add(10);  // 5
//        list.add(3);  // 6
//        list.add(4);  // 7
//        list.add(5);  // 8
//        list.add(6);  // 9
//        list.add(7);  // 10
//        list.add(8);  // 11


        System.out.println(sqrt(1));
        System.out.println(sqrt(0));
        System.out.println(sqrt(930675566));


//        System.out.println(firstBinarySearch(Ar,17));
//        System.out.println(lastBinarySearch(Ar, 17));
//        System.out.println(xInSortedArray(Ar, 17));
    }


}
