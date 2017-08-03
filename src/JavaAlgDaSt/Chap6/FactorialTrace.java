package JavaAlgDaSt.Chap6;

/**
 * Created by tuxedo21 on 22/02/17.
 */
public class FactorialTrace {

    public static int count = 0;
    public static int time = 0;
    public static long nFactorialTrace(long n){
        long value;
        count++;
        time++;
        System.out.println("At time " + time);
        System.out.println("\tFactorial has been INVOKED for the " + count + "th time, with n = to " +n);

        if(n == 0){
            time++;
            System.out.println("\nAt time " + time);
            System.out.println("\tRETURNING 0! = 1 for the " + count-- + "th invocation of nFactorial");
            return 1;
        }else {
            System.out.println("\tnFactorial is INVOKING ITSELF with n = to " + (n -1));
            value = n * nFactorialTrace(n-1);
            time++;
            System.out.println("At time " + time);
            System.out.println("\tRETURNING " + n + "! = "+ value+" from the "+count-- + "th invocation of nFactorial");
            return value;
        }

    }


}
