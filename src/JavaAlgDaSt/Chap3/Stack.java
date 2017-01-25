package JavaAlgDaSt.Chap3;

/**
 * Created by tuxedo21 on 13/01/17.
 */
public class Stack {

    private Listing2[] data;
    private int top;
    private int size;

    public Stack(int s) {
        this.size = s;
        this.top = -1;
        this.data = new Listing2[s];
    }

    public Stack() {
        this.size = 100;
        this.top = -1;
        this.data = new Listing2[100];
    }

    public boolean push(Listing2 newNode){
        if (top == size-1)
            return false;
        else {
        top++;
        data[top] = newNode.deepCopy();
        return true;}
    }

    public Listing2 pop(){
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
