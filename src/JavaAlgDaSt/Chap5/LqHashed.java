package JavaAlgDaSt.Chap5;

import JavaAlgDaSt.Chap4.Listing2;

/**
 * Created by tuxedo21 on 15/02/17.
 */
public class LqHashed  {

    int N; //Range of data struc
    int n =0; //
    int defaultQuotient = 9967;
    double loadingFactor = 0.75;
    Listing2 deleted; // the dummy node
    private Listing2 [] data; // the primary storage array

    public LqHashed(int length) {
        int pct = (int) ((1.0 / loadingFactor - 1) * 100.00);
        N = fourKPlus3(length,pct);
        data = new Listing2[N];
        deleted = new Listing2("","","");
        for(int i = 0; i < data.length; i++){
            data[i] = null;
        }
    }

    public boolean insert(Listing2 newListing){

        boolean noError;
        boolean hit = false;
        int pass, q, offset, ip;
        int pk = stringToInt(newListing.getKey());
        if((((double) n) / N) < loadingFactor){
            pass = 0;
            q = pk / N;
            offset = q;
            ip = pk % N;
            if(q % N ==0)
                offset = defaultQuotient;
            while (pass < N){
                if(data[ip] == null || data[ip] == deleted){
                    hit = true;
                    break;
                }
                ip = (ip + offset) % N;
                pass++;
            }if (hit == true){
                data[ip] = newListing.deepCopy();
                n++;
                return noError = true;
            }else
                return noError = false;

        }else
            return noError = false;
    }

    public Listing2 fetch(String targetKey){
        boolean noError;
        boolean hit = false;
        int pass, q, offset, ip;
        int pk = stringToInt(targetKey);
        pass = 0;
        q = pk / N;
        offset = q;
        ip = pk % N;
        if (q % N == 0)
            offset = defaultQuotient;
        while (pass < N){
            if(data[ip] == null)
                break;
            if(data[ip].compareTo(targetKey) == 0){
                hit = true;
                break;
            }
            ip = (ip + offset) % N;
            pass++;
        }if(hit == true)
            return data[ip].deepCopy();
        else
            return null;
    }

    public boolean delete(String targetKey){

        boolean noError;
        boolean hit = false;
        int pass, q, offset, ip;
        int pk = stringToInt(targetKey);
        pass = 0;
        q = pk / N;
        offset = q;
        ip = pk % N;
        if (q % N == 0)
            offset = defaultQuotient;
        while (pass < N){
            if(data[ip] == null)
                break;
            if(data[ip].compareTo(targetKey) == 0){
                hit = true;
                break;
            }
            ip = (ip + offset) % N;
            pass = pass +1;
        }
        if(hit == true){
            data[ip] = deleted;
            n--;
            return noError = true;
        }else
            return noError = false;
    }

    public boolean update(String targetKey, Listing2 newListing){
        if(delete(targetKey) == false)
            return false;
        else if(insert(newListing) == false)
            return false;
        return true;
    }

    public void showAll(){

        for(int i = 0; i < N; i++){
            if(data[i] != null && data[i] != deleted){
                System.out.println(data[i].toString());
            }
        }

    }


    public static int fourKPlus3(int n, int pct){
        double pctd = pct;
        int prime = (int) (n * (1.0 + (pctd/100.00))); //get the number estimate
        boolean aPrime = false;
        boolean fkp3 = false;
        int highDivisor,d;

        if(prime % 2 == 0)// if the number estimate is even, make it odd
            prime++;
        while (fkp3 == false){
            while (aPrime==false){
                highDivisor = (int) (Math.sqrt(prime) + 0.5); //highDivisor is used for
                for (d = highDivisor; d > 1; d--){ //check to see if divisible with highDivisor and all numbers less than it
                    if(prime % d ==0) //we got to one! so it is prime!
                        break;
                }
                if(d != 1){//we did not get to one, so not prime
                    prime = prime +2; // increase to the next highest odd
                }else
                    aPrime = true;
            }
            if((prime - 3) % 4 == 0){ //formula to check if fkp3
                fkp3 = true;
            }
            else {
                prime = prime + 2; //not a fkp3 get next odd number
                aPrime = false;
            }
        }
        return prime;
    }

    public static int stringToInt(String aKey){
        int pseudoKey = 0;
        int n =1;
        int cn = 0;
        char c[] = aKey.toCharArray();
        int grouping = 0;
        while (cn < aKey.length()){
            grouping = grouping << 8;
            grouping = grouping + c[cn];
            cn++;
            if(n==4 || cn == aKey.length()){
                pseudoKey = pseudoKey + grouping;
                n=0;
                grouping=0;
            }
            n++;
        }
        return Math.abs(pseudoKey);
    }


}
