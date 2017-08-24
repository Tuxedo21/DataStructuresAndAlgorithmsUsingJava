package CtCi.DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * Created by tuxedo21 on 20/08/17.
 */
public class PowerSet {

    static HashSet<ArrayList<Integer>> getPowerSet(ArrayList<Integer> set){
        HashSet<ArrayList<Integer>> powerset = new HashSet<ArrayList<Integer>>();
        addPowerSet(set,powerset);
        return powerset;
    }
    static void addPowerSet(ArrayList<Integer> set,HashSet<ArrayList<Integer>> powerset){
        if (set.isEmpty()){
            return;
        } else {
            powerset.add(set);
                for (int i = 0; i < set.size(); i++ ){
                    ArrayList<Integer> tmp = (ArrayList<Integer>) set.clone();
                    tmp.remove(i);
                    addPowerSet(tmp,powerset);
                }}}


    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);


        HashSet<ArrayList<Integer>> result = getPowerSet(test);

        for (ArrayList<Integer> ar : result){

        System.out.println(ar.toString());

        }
    }
}
