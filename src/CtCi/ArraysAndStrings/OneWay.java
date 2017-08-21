package CtCi.ArraysAndStrings;

import java.util.Stack;

/**
 * Created by tuxedo21 on 10/08/17.
 */
public class OneWay {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Stack<String> s1 = (Stack<String>) s.clone();
    }
}
