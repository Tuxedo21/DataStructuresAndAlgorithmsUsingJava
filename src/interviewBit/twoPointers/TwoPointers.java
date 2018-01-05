package interviewBit.twoPointers;

import java.util.ArrayList;

public class TwoPointers {


    public static boolean findZeroPair(int [] A){


        int j = A.length - 1;
        for (int i = 0; i < A.length; i++)
            for (; j > i; j--) {
                if (i != j && A[i] + A[j] == 0) return true; // solution found.
                if (A[i] + A[j] < 0) break; // Clearly A[i] + A[j] would decrease as j decreases.
            }

            return false;
    }

    public static int removeDuplicates(ArrayList<Integer> a) {
        for (int i = 1; i < a.size(); i++){
            if (a.get(i).equals(a.get(i-1))) {
                a.remove(i - 1);
                i--;
            }
        }
        return a.size();
    }

    public static int theirRemoveDuplicates(ArrayList <Integer> a){
        if (a.size() < 2) return a.size();

        // List#remove is proportional to the number of elements after the removed index
        // Thus, we move from the end for optimal run time
        int prev = a.get(a.size() - 1);
        for (int i = a.size() - 2; i >= 0; i--) {
            if (a.get(i) == prev) {
                a.remove(i);
            }
            else {
                prev = a.get(i);
            }
        }

        return a.size();
    }

    public static void main(String[] args) {
        int [] ar = new int[] { -20,-18, -17, -16, -15, -14, -13, //-12, -11, -10, -9  -8  -7  -6  -5  -4  -3  -2  -1,
                0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10,  11,  12,  13,  14,  15,  16,  17,  18,  19};

        System.out.println(findZeroPair(ar));

        ArrayList<Integer> a = new ArrayList<>();

        a.add(-1); a.add(-1);a.add(1); a.add(1); a.add(2); a.add(2);a.add(2);
        a.add(5000); a.add(5000); a.add(5000);
        System.out.println(a.toString());
        removeDuplicates(a);
        System.out.println(a.toString());

    }

}
