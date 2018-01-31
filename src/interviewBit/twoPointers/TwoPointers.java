package interviewBit.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        if (A == null)
            return arrayList;
        if (A.isEmpty())
            return arrayList;
        if (A.size() < 3)
            return arrayList;


        Collections.sort(A);


        for (int i = 0; i < A.size()-2; i++) {
            for (int j = i+1; j < A.size(); j++)
                for (int k = A.size() - 1; k > j; k--) {

                    if (j >= k)
                        break;

                    if (i != j && i != k && j != k && A.get(i) + A.get(j) + A.get(k) == 0) {
                        if(!arrayList.contains(new ArrayList<>(Arrays.asList(A.get(i), A.get(j), A.get(k)))))
                            arrayList.add(new ArrayList<>(Arrays.asList(A.get(i), A.get(j), A.get(k))));
                    }
                    else if (A.get(j) + A.get(k) - A.get(i) < 0)
                        break;
                    //else if (A.get(j) + A.get(k) - A.get(i) > 0)
                     //   break;
                }
        }
        return arrayList;
    }

    public static void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> c = new ArrayList<>();

        int i = 0, j = 0;

        while ( i < A.size() || j < B.size()){

            if (i > A.size() -1){
                c.add(B.get(j));
                j++; i++;
            }

            else if (j > B.size() -1){
                c.add(A.get(i));
                i++; j++;
            }

            else if (A.get(i) <= B.get(j)){
                c.add(A.get(i));
                i++;
            }

            else if (A.get(i) > B.get(j)){
                c.add(B.get(j));
                j++;
            }

        }

        A.clear();

        for (Integer integer : c){
            A.add(integer);
        }

    }


        public static int maxArea(ArrayList<Integer> A) {

            int maxArea = 0, currentArea;

            for (int i = 0; i < A.size(); i++)
                for (int j = i; j < A.size(); j++){

                    currentArea = Math.min(A.get(i),A.get(j)) * (j - i);
                    if (currentArea > maxArea)
                        maxArea = currentArea;

                }

            return maxArea;
        }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {

        int minAbs = Integer.MAX_VALUE;
        int i = A.size()-1, j = B.size()-1, k = C.size()-1;
        int max, min;

        while (i >= 0 && j >= 0 && k >= 0){
            max = Math.max(Math.max(A.get(i),B.get(j)),C.get(k));
            min = Math.min(Math.min(A.get(i),B.get(j)),C.get(k));
            int temp = max - min;
            if (Math.abs(temp)<minAbs)
                minAbs = temp;

            if (max == A.get(i))
                i--;
            else if (max == B.get(j))
                j--;

            else if (max == C.get(k))
                k--;
        }


        return minAbs;
    }


    public static void main(String[] args) {
        int [] ar = new int[] { -20,-18, -17, -16, -15, -14, -13, //-12, -11, -10, -9  -8  -7  -6  -5  -4  -3  -2  -1,
                0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10,  11,  12,  13,  14,  15,  16,  17,  18,  19};
        // System.out.println(findZeroPair(ar));
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        a.add(1); a.add(4); a.add(5); a.add(8); a.add(10);
        b.add(6); b.add(9); b.add(15);
        c.add(2); c.add(3); c.add(6); c.add(6);

        System.out.println(solve(a,b,c));

       // System.out.println(maxArea(a)+"");
    }

}
