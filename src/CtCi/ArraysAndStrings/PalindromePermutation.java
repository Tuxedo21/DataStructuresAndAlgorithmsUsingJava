package CtCi.ArraysAndStrings;

/**
 * Created by tuxedo21 on 9/08/17.
 */
public class PalindromePermutation {
    //TODO Make this better, within 12 min
    public static void main(String[] args) {
        System.out.println(isPerOfPal("Tact Coa"));
    }

    static boolean isPerOfPal(String s){
        s = s.replaceAll(" ","").toLowerCase();
        int [] ascii = new int[127];
        for (char c : s.toCharArray()){
            ascii[c]++;
        }
        int countOdd = 0;
        for (int i : ascii){
            if (!(i % 2 == 0))
                countOdd++;
        }
        return countOdd <= 1;
    }
}
