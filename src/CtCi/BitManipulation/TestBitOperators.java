package CtCi.BitManipulation;

/**
 * Created by tuxedo21 on 24/08/17.
 */
public class TestBitOperators {

    public static void main(String[] args) {

        /*
        * x << n add 0s to the right
        * x >> n Leaves first bit as is and rotates to the right
        * x >>> n Add 0s to the left
        *
        * */

        int n = ~0;

        System.out.println(n + "");

        n= ~0 >>> 2;

        System.out.println(n + "");

        n = ~0 >> 1;

        System.out.println(n+"");

        n = 1 >> 2;

        System.out.println(n+"");

        n = -100 >>> 1;

        System.out.println(n+"");

        n = -100 >> 1;

        System.out.println(n+"");


    }

}
