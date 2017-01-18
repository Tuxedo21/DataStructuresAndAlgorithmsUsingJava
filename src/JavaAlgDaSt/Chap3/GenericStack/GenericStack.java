package JavaAlgDaSt.Chap3.GenericStack;

/**
 * Created by tuxedo21 on 17/01/17.
 */
public class GenericStack<T> {

    private T[] data;
    private int top;
    private int size;

    public GenericStack(int s) {
        this.size = s;
        this.top = -1;
        this.data =  (T[]) new Object[s];
    }

    public GenericStack() {
        this.size = 100;
        this.top = -1;
        this.data = (T[]) new Object[100];
    }

    public boolean push(T newNode){
        GenericNode node = (GenericNode) newNode;
        if (top == size-1)
            return false;
        else {
            top++;
            data[top] = (T) node.deepCopy();
            return true;}
    }

    public T pop(){
        if(top == -1)
            return null;
        else {
            int topLocation = top;
            top--;
            return data[topLocation];
        }
    }

    public void restart(){
        top = -1;
    }

    public void showAll(){
        for (int i = top; i >=0; i--){
            System.out.println(data[i].toString());
        }
    }

}
