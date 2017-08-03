package codelab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tuxedo21 on 2/03/17.
 */
public class Single {

    public static int singleNumber(final List<Integer> a) {

        if (a.isEmpty())
            return -1;

        Integer single = a.get(0);
        for(int i = 1; i < a.size(); i++){

                single ^= a.get(i);
        }
        return single;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(4);
        a.add(1);
        a.add(1);
        System.out.println(a.toString());

        System.out.println(singleNumber(a));
    }

}
