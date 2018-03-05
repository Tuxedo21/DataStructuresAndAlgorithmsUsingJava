package interviewBit.StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by tuxedo21 on 5/03/18.
 */
public class Main {


    public String reverseString(String A) {
        Stack<Character> stack = new Stack<>();
        String B = "";

        for (Character c: A.toCharArray()) {
            stack.push(c);
        }

       while (!stack.empty()){
            B = B+""+stack.pop();
        }

        return B;
    }

    public int isValid(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {

            char c= A.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return 0;
                }

                char top = stack.peek();

                if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
                    stack.pop();
                } else
                    return 0;
            }
        }

        if (!stack.isEmpty())
            return 0;

        return 1;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.reverseString("abc"));
        System.out.println(main.isValid("((((([{()}[]]{{{[]}}})))))"));


    }
}
