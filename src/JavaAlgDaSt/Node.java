package JavaAlgDaSt;

import javax.swing.*;

/**
 * Created by tuxedo21 on 24/12/16.
 */
public class Node implements KeyMode {

    private String name;
    private String address;
    private String number;

    public Node(String n, String a, String num){
        name = n;
        address = a;
        number = num;
    }

    public String toString(){
        return "Node: " + name + " : " + address + " : " + number;
    }

    public Node deepCopy(){
        Node clone = new Node(name, address, number);
        return clone;
    }

    @Override
    public int compareTo(Object targetKey) {
        String tKey = (String) targetKey;
        return (name.compareTo(tKey));
    }


    public void setAddress(String a){
        address = a;
    }

    public void input(){
        name = JOptionPane.showInputDialog("Enter a name: ");
        address = JOptionPane.showInputDialog("Enter an address");
        number = JOptionPane.showInputDialog("Enter a number");
    }

}
