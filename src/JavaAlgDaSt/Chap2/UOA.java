package JavaAlgDaSt.Chap2;

/**
 * Created by tuxedo21 on 24/12/16.
 */
public class UOA<T> {
    private int next;
    private int size;
    private T[] data;

    public UOA(int s){
        next = 0;
        size = s;
        data = (T[]) new Object[s];
    }

    public UOA(){
        next = 0;
        size = 100;
        data = (T[]) new Object[size];
    }


    public boolean insert(T newListing){
        KeyMode node = (KeyMode) newListing;
        if(next >= size){
            return false;//check for too many listings
        }
        data[next] = (T) node.deepCopy();
        if(data[next] == null){//check for insufficient memory
            return false;
        }
        next++;
        return true;
    }

    public KeyMode fetch(Object targetKey){
        KeyMode node = (KeyMode) data[0]; // KeyMode instantiates a generic 'node' with the KeyMode methods
        T temp;
        int i = 0;
        while (i < next && !(node.compareTo(targetKey) == 0) ){
            i++;
            node = (KeyMode) data[i];
        }
        if(i == next) // the node with the given key was not found
            return null;
        node = node.deepCopy();
        //Move the node up one position in the array, unless it is the first node
        if(i != 0){ // bubble-up accessed node
            temp = data[i - 1];
            data[i - 1] = data[1];
            data[i] = temp;
        }
        return node;
    }

    public boolean delete(Object targetKey){
        KeyMode node = (KeyMode) data[0];
        int i = 0;
        while (i < next && !(node.compareTo(targetKey) == 0)){
            i++;
            node = (KeyMode) data[i];
        }
        if(i == next)
            return false;
        //Move the last node into the deleted node's position
        data[i] = data[next - 1];
        data[next - 1] = null;
        next--;
        return true;
    }

    public boolean update(Object targetKey, T newNode){
        if(delete(targetKey) == false)
            return false;
        else if(insert(newNode) == false)
            return false;
        else
            return true;
        }

        public void showAll(){
            for (int i = 0; i < next; i++)
                System.out.println(data[i].toString());
        }
}
