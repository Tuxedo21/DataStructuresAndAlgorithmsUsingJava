package JavaAlgDaSt.Chap3;

/**
 * Created by tuxedo21 on 13/01/17.
 */
public class Listing {
    //Member vars
    private String name;
    private String address;
    private String number;

    //Constructor
    public Listing(String name, String address, String numer) {
        this.name = name;
        this.address = address;
        this.number = numer;
    }

    @Override
    public String toString() {
        return ("Name is:"+name+"\nAddres is: "+address+"\nNumber is:"+ number+"\n\n");
    }

    public int compareTo(String targetKey){
        return (name.compareTo(targetKey));
    }

    public Listing deepCopy(){
        Listing clone = new Listing(name,address,number);
        return clone;
    }
}
