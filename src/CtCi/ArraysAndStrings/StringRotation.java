package CtCi.ArraysAndStrings;

/**
 * Created by tuxedo21 on 9/08/17.
 */
public class StringRotation {

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle","erbottlewat"));
        System.out.println(isRotation("watterbotle","erbottlewat"));
    }

    private static boolean isRotation(String s1, String s2) {
        String s1s1 = s1 + s1;
        return s1.length() == s2.length() && s1s1.contains(s2);
    }

}
