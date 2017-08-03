package JavaAlgDaSt.Chap8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by tuxedo21 on 27/02/17.
 */
public class RandomArray {


    public static int[] IntArray(int length, int min, int max){
        int [] array = new int [length];

        for (int i =0; i < length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(min, max +1);
        }

        return array;
    }

}
