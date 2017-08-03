package CtCi;

import java.util.ArrayList;

/**
 * Created by tuxedo21 on 4/11/16.
 */
public class StringPermutation {

    public static ArrayList<String> getPerms(String s){
        ArrayList<String> permutations = new ArrayList<>();
        if(s==null ){ // empty case
            return null;
        } else if(s.length() == 0){ // nothing in string
            permutations.add("");
            return permutations;
        }
        char fist = s.charAt(0); // get first element, e.g. "abc" -> 'a'
        String remainder = s.substring(1); // get rest of string
        ArrayList<String> words = getPerms(remainder);
        for(String word : words){
            for(int j = 0; j <= word.length(); j++)
                permutations.add(insertCharAt(word,fist,j));
        }
        return permutations;
    }



    public static String insertCharAt(String word, char c, int i){
            String start = word.substring(0,i);
            String end = word.substring(i);
            return start + c + end;
    }


    public static void main(String[] args) {
        System.out.println(getPerms("abcdefg"));
    }
}
