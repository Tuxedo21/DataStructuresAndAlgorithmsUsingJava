package JavaAlgDaSt.Chap4;

/**
 * Created by tuxedo21 on 24/01/17.
 */
public class Listing2 {
    private String name;
    private String address;
    private String number;
    private boolean pushed;

    public Listing2(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String toString(){
        return ("Name is:"+name+"\nAddres is: "+address+"\nNumber is:"+ number+"\n\n");
    }

    public Listing2 deepCopy(){
        Listing2 clone = new Listing2(name,address,number);
        return clone;
    }

    public String getKey(){
        return name;
    }

    public int compareTo(String targetKey){
        return (name.compareTo(targetKey));
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void setPushed(boolean pushed) {
        this.pushed = pushed;
    }

    public void visit() {
        System.out.println(this);
    }

    public boolean getPushed() {
        return pushed;
    }
}
