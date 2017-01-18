package JavaAlgDaSt.Chap2;

/**
 * Created by tuxedo21 on 24/12/16.
 */
public class MainUOA {
    public static void main(String[] args) {

        UOA <PhoneListing> NYC = new UOA<>(500);
        PhoneListing bob = new PhoneListing("Bob","23 1st Avenue","133-5874");
        PhoneListing roy = new PhoneListing("Roy","1 23rd Avenue","789-5874");

        NYC.insert(bob);
        NYC.insert(roy);
        System.out.println(NYC.fetch("Roy").toString());
        System.out.println(NYC.fetch("Bob").toString());
    }//end of main method
}// end of class MainUOA
