package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuxedo21 on 29/10/16.
 */
public class ShellSort {

    static 	public String longestPalindrome(String a) {
        String pal = "";
        StringBuilder stringBuilder;
        String reverse;
        String normal;
        int left = a.length();
            for (int i=0; i < a.length() +1 / 2; i++){
                for (int j = i; j < a.length() + 1; j++){
                    stringBuilder = new StringBuilder(a.substring(i,j));
                    normal = stringBuilder.toString();
                    reverse = stringBuilder.reverse().toString();
                    if (normal.equals(reverse) && normal.length() > pal.length())
                        pal = normal;

                }
                if(pal.length() > left)
                    break;
                left--;
            }


        return pal;

    }



    static public String intToRoman(int a) {
        String roman = "";
        String [] romNum = new String[] {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int [] nums      = new int[]    { 1 , 4 , 5 , 9, 10, 40, 50, 90 , 100 , 400 , 500, 900, 1000};

        int i = romNum.length -1;
        while (a > 0){

            if (a >= nums[i]){
                a = a - nums[i];
                roman = roman + romNum[i];
            }

            if (a < nums[i])
                i--;
        }


        return roman;
    }

    static public int strStr(final String haystack, final String needle) {


        for (int i =0; i < haystack.length() - needle.length()+1; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                if (haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }

        }


        return -1;

    }

    static public int atoi(final String a) {
        if (a.contains(" ")){
            return Integer.parseInt(a.split(" ")[0]);
        }
        //int max
        //int min


        return 0;
    }

    static 	public int searchInsert(ArrayList<Integer> a, int b) {

        if (a.size() == 1){
            if (a.get(0) <= b)
                return 0;
            else
                return 1;
        }

        if (b < a.get(0))
            return 0;


        for (int i = 0; i < a.size()-1; i++){
            if (a.get(i) == b)
                return i;
            else if (a.get(i) < b && b < a.get(i+1) )
                return i+1;
        }


        return a.size();
    }

    public static void main(String[] args) {
    /*    System.out.println(longestPalindrome("aaaabaaafowehfouwejfweohgoewjogiwejforweohgpoiwejfoiwehopfiwepogfoewfpoiewgfoshfoewhyfrwbgjwegfkej"));
        System.out.println(longestPalindrome("abb"));
        System.out.println(longestPalindrome("aabbcbbaaab"));
        System.out.println(longestPalindrome("qwertyuioppdfgsdcvfbesrdftygrctfvgybhredtfyguoiouydrfyghuioiuytrdsfghioyutcgfhjbuytfdcghjuytfghjuygfcgvhrdesxfcrdesxfc"));
*/
        //System.out.println(intToRoman(50));
        //System.out.println(intToRoman(60));

       // System.out.println(strStr("hllohe","he"));
       // System.out.println(strStr("bbbbbbbbab","baba"));

       /* System.out.println(atoi("9 2704")+"");
        System.out.println(atoi("- 5 88C340185Q 71 8079 834617385 2898422X5297Z6900")+"");
        System.out.println(Integer.MAX_VALUE + 0 + " done"); // -2147483648
                                                             //  2147483647/=*/

        int [] arr = new int[] {1,3,5,6};
        ArrayList arrayList = new ArrayList(Arrays.asList(arr));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(3);a.add(5);a.add(6);

        System.out.println(searchInsert(a,3)+"");
    }

}
