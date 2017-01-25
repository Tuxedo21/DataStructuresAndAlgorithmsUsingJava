package JavaAlgDaSt.Chap3.Queue;

import JavaAlgDaSt.Chap3.Listing2;

/**
 * Created by tuxedo21 on 14/01/17.
 */
public class Queue {

    private int size;
    private int rear;
    private int front;
    private int numOfNodes;
    private Listing2[] data;

    public Queue(int s) {
        this.size = s;
        this.rear = 0;
        this.front = 0;
        this.numOfNodes = 0;
        this.data = new Listing2[s];
    }

    public Queue() {
        this.size = 100;
        this.rear = 0;
        this.front = 0;
        this.numOfNodes = 0;
        this.data = new Listing2[100];
    }

    public boolean enque(Listing2 newNode){
        if(rear + 1 == size)
            return false;
        else {
            numOfNodes++;
            data[rear] = newNode.deepCopy();
            rear = (rear + 1) % size;
            return true;
        }
    }

    public Listing2 deque(){
        if(numOfNodes == 0)
            return null;
        else {
            numOfNodes--;
            int frontLocation = front;
            front = (front + 1) % size;
            return data[frontLocation];
        }
    }

}
