package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 4/11/16.

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */





public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int i =0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if( nums[i] + nums[j] == target && i !=j){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1};
    }

    public  ArrayList<int[]> whatSums(int target){
        ArrayList<int[]>  pairs = new ArrayList<>();
        if( target == 0){
            pairs.add(new int[]{0,0});
            return pairs;
        }

        int x = target -1;
        int y = 1;
        while (! (x < y)){
            pairs.add(new int[]{x,y});
            System.out.println(x+":"+y);
            x--;
            y++;
        }
        return pairs;
    }

    public int[] bTwoSum(int[] nums, int target) {
        ArrayList<int[]> pairs = whatSums(target);
        for(int[] pair : pairs){
            for (int i = 0; i < nums.length; i++){
                if(pair[0] == nums[i]){
                    for (int j = i; j < nums.length; j++){
                        if (pair[1] == nums[j] && i != j){
                            return new int[] {i, j};
                        }
                    }
                }
                else if(pair[1] == nums[i]){
                    for (int j = i; j < nums.length; j++){
                        if (pair[0] == nums[j] && i != j){
                            return new int[] {i, j};
                        }
                    }
                }
            }
        }
        return twoSum(nums,target);
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println( Arrays.toString( twoSum.bTwoSum(new int[] {3,2,0,0,0,0,0,0,4},0) ) + "b");
        System.out.println( Arrays.toString( twoSum.twoSum(new int[] {3,2,0,0,0,0,0,0,4},0) ));


    }

}
