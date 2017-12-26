package StanfordDivCon;

import java.util.Queue;

public class BTree<T extends Comparable<? super T>>  {
    private class Node<T extends Comparable>{
        public T data;
        public Node<T> left,right;

        private Node(T data) {
            this.data = data;
        }

    }

    public Node<T> root;

    public BTree(T data) {
        root = new Node<>(data);
    }

    public void insert(T data){
        insert(root,data);
    }

    private void insert(Node<T> node, T data){
        if(node.data.compareTo(data)<=0) {
            if (node.left != null)
                insert(node.left, data);
            else
                node.left = new Node<>(data);
        }
        else {
            if (node.right != null)
                insert(node.right, data);
            else
                node.right = new Node<>(data);
        }

    }

    public T getData(){
        return root.data;
    }

    public Node<T> left() {
        return root.left;
    }
    public Node<T> right() {
        return root.right;
    }



    public boolean hasData(T data) {

        return hasData(root, data);
    }
    private boolean hasData(Node<T> node, T data) {

        return (node != null) && ((node.data.compareTo(data) == 0) || hasData(node.left, data) || hasData(node.right, data));
    }


    public void preorder(){
        preorder(root);
    }
    private void preorder(Node<T> node){
        System.out.println(node.data);
        if(node.left != null)
            preorder(node.left);
        if(node.right != null)
            preorder(node.right);
    }
}
