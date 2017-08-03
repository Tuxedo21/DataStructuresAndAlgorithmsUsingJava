package codelab;

import java.util.Locale;

/**
 * Created by tuxedo21 on 2/03/17.
 */
public class NumBits {

    public static int nBits(long i){



        String iStr = Long.toBinaryString(i);
        int count = 0;
        for(char x: iStr.toCharArray()){
            if (x == ('1'))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        long x = 11;




        System.out.println(Long.toBinaryString(-1));
        System.out.println(nBits(x));
    }
}
