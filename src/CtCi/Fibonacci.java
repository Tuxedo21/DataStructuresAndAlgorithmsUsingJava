package CtCi;

/**
 * Created by tuxedo21 on 4/11/16.
 */
public class Fibonacci {

    public static int fibo(int n){

        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else if(n > 1){
            return fibo(n -1) + fibo(n -2);
        }
        else {
            return -1;
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++)
            System.out.println(fibo(i) + " : " +i);
    }
}
