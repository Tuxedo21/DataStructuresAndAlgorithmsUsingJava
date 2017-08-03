package JavaAlgDaSt.Chap6;

/**
 * Created by tuxedo21 on 22/02/17.
 */
public class MainFactorial {
    public static void main(String[] args) {
        long n = 15;
        System.out.println(n + " factorial is " + Factorial.nFactorial(n));
        FactorialTrace.nFactorialTrace(n);
    }
}
