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
            return 0;
        }

    }

    public static int fiboM(int n){
        int[] memo = new int[n+1];
        return fiboM(n,memo);

    }

    public static int fiboM(int n, int [] memo){
        if(n == 0 || n == 1)
            return 1;
        else if(memo[n] > -1)
            return memo[n];
        else{
            memo[n] = fiboM(n-1,memo) + fiboM(n-2,memo);
            return memo[n];
        }
    }

    public static void main(String[] args) {
       // for (int i = 1; i < 45; i++)
       //     System.out.println(fibo(i) + " : " +i);

        System.out.println(fibo(46));
    }


}
