package CtCi.TreesAndGraphs;

/**
 * Created by tuxedo21 on 4/05/17.
 * Given a sorted increasing order array with unique integer elements, write an algorithm to create a binary search tree with minimal height
 */
public class MinimalTree {

   static tNode buildBST(int[] arr){
       return buildBST(arr,0,arr.length-1);
   }

   static tNode buildBST(int[] arr,int start, int end){
       if(end < start)
        return null;
       int mid = (start + end) / 2;
       tNode n = new tNode(arr[mid]);
       n.left = buildBST(arr,start,mid-1);
       n.right = buildBST(arr,mid+1,end);
       return n;
   }



    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        buildBST(arr).showTree();


    }
}

