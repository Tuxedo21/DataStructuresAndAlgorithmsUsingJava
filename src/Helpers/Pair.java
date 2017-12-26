package Helpers;

public class Pair<T extends Comparable,Y extends Comparable> {
    T key;
    Y data;

    Pair(T key,Y data){
        this.key = key;
        this.data = data;
    }



}
