package codelab;

/**
 * Created by tuxedo21 on 1/10/17.
 */
public class numPal {

    static boolean isNumPal(int num){
        int oNum = num;
        int pal = 0;
        int tmp;
        int pow = ((int) Math.log10(num)); //do more


        for(int i = 0; i < ((int) Math.log10(num))+1; i++){
            tmp = (int) (num % (10 * Math.pow(10,i)));
            System.out.println("tmp: "+tmp);
            num = (num - tmp);
            System.out.println("num: "+num);
            pal+=(int) (tmp * Math.pow(10,pow));
            System.out.println("pal: "+pal);
            pow-=2;
        }


        return pal == oNum;
    }


    public static void main(String[] args) {

        System.out.println(isNumPal(1234554321));


    }
}
