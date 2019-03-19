package queue;


public class QueueDef {

    int[] qarray;
    int front, rear, cap;
    public static final int CAPACITY = 4;
    int size;

    QueueDef() {
        this.cap = CAPACITY;
        this.qarray = new int[cap];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    QueueDef(int capacity) {
        this.cap = capacity;
        this.qarray = new int[cap];
        this.front = 0;
        this.front = 0;
        this.size = 0;
    }


    public void enQueue(int data) throws NullPointerException, IllegalStateException {
        if (isFull()) {

            throw new IllegalStateException("the stack is already full");
        } else {
            size++;
            qarray[rear] = data;
            rear = (rear + 1) % cap;

        }
    }

    public int deQueue() throws NullPointerException, IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("underflow exception");
        } else {
            size--;
            int data = qarray[front % cap];
            qarray[front % cap] = Integer.MIN_VALUE;
            front = (front + 1) % cap;

            return data;
        }
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == cap);
    }

    //print the queue
    public String printQueue() {
        String s = "[";
        if (!isEmpty()) {
            s = s + qarray[front];
            for (int i = 1; i < size; i++) {
                s = s + "," + qarray[(front + i) % cap];

            }
        }
        return s + "]";
    }
}
