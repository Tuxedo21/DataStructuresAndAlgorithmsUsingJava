package CtCi.Moderate;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.*;
import java.awt.image.ColorConvertOp;
import java.awt.image.PixelGrabber;
import java.util.*;

/**
 * Created by tuxedo21 on 26/12/17.
 */
public class SimpleModerates {


    public static void numberSwapper(int a, int b){ // 16.1 Number Swapper
        System.out.println("a: " + a + " b: " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static ArrayList<Integer> bruteNumberMax(ArrayList<Integer> ar1, ArrayList<Integer> ar2 ){ //16.6 Smallest Difference


        int minDif = Integer.MAX_VALUE;
        int newDif;
        ArrayList<Integer> values = new ArrayList<>();
        values.add(0);
        values.add(0);

        for (Integer i : ar1){
            for (Integer j : ar2){
                newDif = Math.abs(i - j);
                if( newDif < minDif){
                        minDif = newDif;
                        values.set(0,i);
                        values.set(1,j);
                }
            }
        }

        return values;
    }

    public static ArrayList<Integer> sortNumberMax(ArrayList<Integer> ar1, ArrayList<Integer> ar2 ){ //16.6 Smallest Difference

        ArrayList<NumberAndColor> ar3 = new ArrayList<>();

        for (Integer i : ar1)
            ar3.add(new NumberAndColor(i,true));

        for (Integer i : ar2)
            ar3.add(new NumberAndColor(i,false));

        Collections.sort(ar3);

        int minDif = Integer.MAX_VALUE;
        int newDif;

        ArrayList<Integer> values = new ArrayList<>();
        values.add(0); values.add(0);

        for (int i = 0; i < ar3.size() - 2; i++){
            newDif = Math.abs(ar3.get(i).num - ar3.get(i+1).num);
            if(newDif < minDif && ar3.get(i).color != ar3.get(i+1).color){
                minDif = newDif;
                values.set(0,ar3.get(i).num);
                values.set(1,ar3.get(i+1).num);
            }
        }
        return values;
    }

    public static class NumberAndColor implements Comparable<NumberAndColor>{ //16.6 Smallest Difference
        public Integer num;
        public Boolean color;

        public NumberAndColor(Integer num, Boolean color) {
            this.num = num;
            this.color = color;
        }

        @Override
        public String toString() {
            return "{" +
                    "num=" + num +
                    ", color=" + color +
                    '}';
        }

        @Override
        public int compareTo(NumberAndColor o) {
            return Integer.compare(this.num, o.num);
        }
    }



    public static void main(String[] args) {
        numberSwapper(5,10);

        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();

        ar1.add(1); ar1.add(3); ar1.add(15); ar1.add(11); ar1.add(2);
        ar2.add(23); ar2.add(127); ar2.add(235); ar2.add(19); ar2.add(8);


        System.out.println(bruteNumberMax(ar1,ar2).toString());
        System.out.println(sortNumberMax(ar1,ar2).toString());

    }
}
