package CtCi.ArraysAndStrings;
import java.util.*;




/**
 * Created by tuxedo21 on 5/10/17.
 */
public class ValidEntryPoint {

    static class Ship{
        String UL, LR;
        int life;
        boolean hurt = false;

        public Ship(String UL, String LR, int life) {
            this.UL = UL;
            this.LR = LR;
            this.life = life;
        }
    }
    static public String solution(int N, String S, String T) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> letters = new HashMap<>();
        for(int i = 0; i < N; i++){letters.put(  ('A'+i) , i+1);}
        System.out.println(letters);
        ArrayList<Ship> ships = new ArrayList<>();
        for (String ship: S.split(",")){
            String[] line = ship.split(" ");
            ships.add(new Ship(line[0],line[1],
                    (Math.abs(line[0].charAt(0) - line[1].charAt(0))+1) * (Math.abs(line[0].charAt(1) - line[1].charAt(1))+1) ));
        }

        for (String target: T.split(" ")) {
            for(Ship ship : ships){
                if(ship.UL.charAt(0) <= target.charAt(0) && ship.UL.charAt(1) <= target.charAt(1) && ship.LR.charAt(0) >= target.charAt(0) && ship.LR.charAt(1) >= target.charAt(1)){
                    ship.life--;
                    ship.hurt = true;
                    break;
                }
            }
        }
        int dead = 0;
        int hurt = 0;
        for (Ship ship : ships){
            if(ship.life <= 0){
                dead ++;
            }else if(ship.hurt){
                hurt++;
            }
        }

        return dead+","+hurt;
    }


    public static void main(String[] args) {

        System.out.println( solution(3,"1A 1B,2C 2C","1B"));



    }
}
