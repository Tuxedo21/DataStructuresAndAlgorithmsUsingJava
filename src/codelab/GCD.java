package codelab;

/**
 * Created by tuxedo21 on 2/03/17.
 */
public class GCD {

    public static int intGCD(int A,int B){

        if (A == 0)
            return B;
        return intGCD(B % A, A);

    }

    public static void main(String[] args) {
        System.out.println(intGCD(7,21));
    }

}
