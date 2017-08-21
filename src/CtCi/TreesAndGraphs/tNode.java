package CtCi.TreesAndGraphs;

/**
 * Created by tuxedo21 on 3/08/17.
 */
public class tNode {
    int value;
    public tNode left;
    public tNode right;

    public tNode(int value) {
        this.value = value;
    }

    public void showTree(){
            if (this.left != null)
                this.left.showTree();
            System.out.println(this.value);
            if (this.right != null)
                this.right.showTree();
    }

    @Override
    public String toString() {
        return this.value +"";
    }
}
