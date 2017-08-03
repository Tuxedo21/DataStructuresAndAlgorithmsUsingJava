package JavaAlgDaSt.Chap6;

/**
 * Created by tuxedo21 on 22/02/17.
 */
public class Factorial {
    public static long nFactorial(long n){
        if(n == 0){
            return (1);
        }else {
            return n * nFactorial(n - 1);
        }

    }
}
