package Helpers;

import java.util.ArrayList;

/**
 * Created by tuxedo21 on 26/08/17.
 */
public class GNode {

    public String name;
    public ArrayList<GNode> adj  = new ArrayList<>();

    public GNode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + adj.toString();
    }
}
