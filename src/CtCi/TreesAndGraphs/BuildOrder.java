package CtCi.TreesAndGraphs;

import java.util.*;

/**
 * Created by tuxedo21 on 4/05/17.
 */
public class BuildOrder {

    public static Character[] getBuildOrder(char[] proj, ArrayList<char[]> depen){
        Stack<Character> buildOrder = new Stack<>();
        Character [] tF =  trueFathers(proj,depen);
        ArrayList<char[]> garbage = new ArrayList<>();

        for (Character e: tF){
            buildOrder.push(e);
        }

            while (!depen.isEmpty()){
            //garbage.stream().filter(depen::contains).forEach(depen::remove);
                for (char[] g: garbage){
                    if (depen.contains(g))
                        depen.remove(g);
                } garbage.clear();

                for (char[] e: depen) {
                    if (buildOrder.contains(e[0])) {
                        if (!buildOrder.contains(e[1]))
                            buildOrder.push(e[1]);
                        garbage.add(e);
                    }
                }
            }
        return buildOrder.toArray(new Character[buildOrder.size()]);
    }

    public static Character[] trueFathers(char[] proj, ArrayList<char[]> depen){
        HashSet<Character> sons = getSons(depen);
        HashSet<Character> hProj = gethProj(proj);
        hProj.removeAll(sons);
        return  hProj.toArray(new Character[hProj.size()]);
    }

    private static HashSet<Character> gethProj(char[] proj) {
        HashSet<Character> hProj = new HashSet<>();
        for (char d: proj)
            hProj.add(d);
        return hProj;
    }

    public static HashSet<Character> getSons(ArrayList<char[]> depen){
        HashSet<Character> sons = new HashSet<>();
        for (char[] d: depen)
            sons.add(d[1]);
        return sons;
    }

    public static void main(String[] args) {
        char [] projects = {'a','b','c','d','e','f'};
        ArrayList<char[]> depen = new ArrayList<>();
        depen.add(new char[]{'a', 'd'});
        depen.add(new char[]{'f', 'b'});
        depen.add(new char[]{'b', 'd'});
        depen.add(new char[]{'f', 'a'});
        depen.add(new char[]{'d', 'c'});

        System.out.println(Arrays.toString(projects));
        for (char[] d: depen)
            System.out.println( Arrays.toString(d));

        System.out.println("\n" + Arrays.toString(getBuildOrder(projects,depen)));
    }
}
