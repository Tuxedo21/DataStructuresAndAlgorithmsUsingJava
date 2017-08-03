package CtCi.ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by tuxedo21 on 9/04/17.
 */
public class CheckPermutaion {

    public static boolean isPermutation(String one, String two){
        if(one.length() != two.length())
            return false;

        int [] letters = new int[128];

        char[] sArray = one.toCharArray();  //bread and butter!
        for (char c: sArray){
            letters[c]++;
        }

        System.out.println(Arrays.toString(letters)); //bread and butter!

        for(int i = 0; i < two.length(); i++){
            int c = (int) two.charAt(i);
            letters[c]--;
            if(letters[c] < 0)
                return false;
        }

        return true;



    }

    static void permutation(String str){
        permutation(str,"");
    }

    static void permutation(String str, String prefix){
        if(str.length() == 0)
            System.out.println(prefix);
        else {
            for(int i = 0; i < str.length(); i++){
                String rem = str.substring(0,i) + str.substring(i+1);
                permutation(rem,prefix + str.charAt(i));
            }
        }

    }


    static String urlify(String s, int len){
        s = s.trim();
        s = s.replaceAll(" ","%20");
        return s;
    }


    public static void main(String[] args) {
        System.out.println(isPermutation("abc","bca"));
        System.out.println("      hi      ".trim());
        System.out.println(urlify("Mr John Smith",13));
        permutation("carl");
        System.out.println("carltheo".substring(2,2));


    }
}
