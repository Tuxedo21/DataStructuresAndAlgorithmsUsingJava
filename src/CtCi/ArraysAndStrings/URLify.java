package CtCi.ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 9/08/17.
 */
public class URLify {

    static public void arrange(ArrayList<Integer> a) {

        int aSize = a.size();
        ArrayList<Integer> newArr = (ArrayList<Integer>) a.clone();

        for (int i = 0; i < aSize ; i++){
            a.set(i,newArr.get(newArr.get(i)));
        }

    }

    public static void main(String[] args) {
//        System.out.println( makeURL("Mr%20John%20Smith",13) );
//        System.out.println( makeURL("Mr John Smith",13) );
        int [] arr = new int[] {1,0};
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(0);
        arrange(arrayList);

        System.out.println(arrayList);

    }

    private static String makeURL(String s, int i) {
        return  s.replaceAll(" ","%20")  ;
    }

    private static char [] makeURL(char [] s, int trueLength){
        return s;
    }

}
