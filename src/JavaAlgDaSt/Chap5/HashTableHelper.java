package JavaAlgDaSt.Chap5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tuxedo21 on 9/02/17.
 */
public class HashTableHelper {

    public static int fourKPlus3(int n, int pct){

        double pctd = pct;
        int prime = (int) (n * (1.0 + (pctd/100.00))); //get the number estimate
        boolean aPrime = false;
        boolean fkp3 = false;
        int highDivisor,d;

        if(prime % 2 == 0)// if the number estimate is even, make it odd
            prime++;
        while (fkp3 == false){
            while (aPrime==false){
                highDivisor = (int) (Math.sqrt(prime) + 0.5); //highDivisor is used for
                for (d = highDivisor; d > 1; d--){ //check to see if divisible with highDivisor and all numbers less than it
                    if(prime % d ==0) //we got to one! so it is prime!
                        break;
                }
                if(d != 1){//we did not get to one, so not prime
                    prime = prime +2; // increase to the next highest odd
                }else
                    aPrime = true;
            }
            if((prime - 3) % 4 == 0){ //formula to check if fkp3
                fkp3 = true;
            }
            else {
                prime = prime + 2; //not a fkp3 get next odd number
                aPrime = false;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(fourKPlus3(5000,33)+"");


        Object o = new Object();
        Object d = new Object();

        //System.out.println(iNum.matches("\\d+ \\+ \\d+i"));
        System.out.println( o.hashCode() +" " + d.hashCode() );

    }

}
