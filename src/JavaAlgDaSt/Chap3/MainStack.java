package JavaAlgDaSt.Chap3;

/**
 * Created by tuxedo21 on 13/01/17.
 */
public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        Listing l;
        Listing l1 = new Listing("Bill","Whatever st","159 7894");
        Listing l2 = new Listing("Al","2nd st","159 2786");
        Listing l3 = new Listing("Mike","3rd st","854 7894");
        Listing l4 = new Listing("Carol","4th st","159 7892");
        //Stack underflow
        System.out.println(s.pop());
        //Push to the limit
        System.out.println(s.push(l1));
        System.out.println(s.push(l2));
        System.out.println(s.push(l3));
        s.showAll();
        //Pop 'til empty
        l = s.pop();
        System.out.println(l.toString());
        l = s.pop();
        System.out.println(l.toString());
        l = s.pop();
        System.out.println(l.toString());
        //Return null pop
        l = s.pop();
        System.out.println(l);
        System.exit(0);
    }
}
