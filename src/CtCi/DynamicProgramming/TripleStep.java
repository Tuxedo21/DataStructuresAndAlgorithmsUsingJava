package CtCi.DynamicProgramming;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

/**
 * Created by tuxedo21 on 2/08/17.
 *
 *  Our base step is zero
 *
 *
 */
public class TripleStep {


    public static int countWays(int n){
        if(n < 0)
            return 0;
        else if (n == 0){
            return 1;
        }
        else{
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
        }
    }

    public static long countWaysM(long n){
        long [] memo = new long[ (int) n+1];
        Arrays.fill(memo,-1);
        return countWaysM(n, memo);
    }

    public static long countWaysM(long n, long[] memo){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else if(memo[(int)n] > -1)
            return memo[(int)n];
        else {
            memo[(int)n] = countWaysM(n-1,memo) + countWaysM(n-2,memo) +countWaysM(n-3,memo);
            return memo[(int)n];
        }
    }


    public static void main(String[] args) {


       // System.out.println(countWays(100)+"");
        double amount = Double.parseDouble(countWaysM(100)+"");
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println(formatter.format(amount));

    }

}
