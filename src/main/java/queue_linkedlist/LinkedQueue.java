package queue_linkedlist;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

public class LinkedQueue {
    int length;
    Node head;
    int size, cap;
    public static final int DEFAULT_CAPACITY = 10;

    LinkedQueue() {
        this.cap = DEFAULT_CAPACITY;
        this.size = 0;
        this.head = null;
        length = 0;
    }

    LinkedQueue(int cap) {
        this.cap = cap;
        this.size = 0;
        this.head = null;
        this.length = 0;

    }

    //insert into Queue

    public void enQueue(int data) throws NullPointerException, IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("this is full");

        } else {
            if (this.head == null) {
                head = new Node(data);
                size++;
                length++;
                return;
            } else {
                Node p = head, q = head;
                while ((q = p.next) != null) {
                    p = q;
                }
                p.next = new Node(data);
                size++;
                length++;
                return;
            }
        }
    }


    /// removing or dequeue

    public int deQueue() throws NullPointerException, IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("already empty");

        } else {
            int data = head.data;
            head = head.next;
            size--;
            length--;
            return data;
        }
    }
    //is empty

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == cap);
    }


    //print the queue

    public String print() {
        String s = "[";
        Node p = head;
        if (!isEmpty()) {
            s = s + p.data;
            while (p.next != null) {
                p = p.next;
                s = s + "," + p.data;
            }

        }
        return s + "]";
    }
}
