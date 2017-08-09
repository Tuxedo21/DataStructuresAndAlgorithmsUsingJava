package CtCi.ArraysAndStrings;

/**
 * Created by tuxedo21 on 9/08/17.
 */
public class URLify {

    public static void main(String[] args) {
        System.out.println( makeURL("Mr%20John%20Smith",13) );
        System.out.println( makeURL("Mr John Smith",13) );

    }

    private static String makeURL(String s, int i) {
        return  s.replaceAll(" ","%20")  ;
    }

    private static char [] makeURL(char [] s, int trueLength){
        return s;
    }

}
