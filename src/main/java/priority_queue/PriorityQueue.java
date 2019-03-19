package priority_queue;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}

public class PriorityQueue {
    Node head;
    int length;

    PriorityQueue() {
        this.head = null;
        this.length = 0;

    }

    public void enQueue(int value) {
        if (head == null) {
            head = new Node(value);
            length++;
            return;
        }
        Node p = head, q = head;
        while ((q = p.next) != null) {
            p = q;
            q = p.next;

        }
        p.next = new Node(value);
        length++;
        return;

    }

    public int deQueue() {
        if (head == null) {
            System.out.println("queue is already empty ");
            return Integer.MIN_VALUE;
        }
        int max = head.data;
        Node main = null, prev = null;
        Node p = head, q = head;

        while ((q = p.next) != null) {
            if (q.data > max) {
                max = q.data;
                prev = p;
                main = q.next;

            }
            p = q;
            q = p.next;
        }
        if (head.data == max) {
            head = head.next;
        } else {
            prev.next = main;
        }

        return max;
    }

    public void printQueue() {
        printProiorityQueue(head);
    }


    private void printProiorityQueue(Node h) {
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }

    public int max(){{
        if (head == null) {
            System.out.println("queue is already empty ");
            return Integer.MIN_VALUE;
        }
        int max = head.data;
        Node main = null, prev = null;
        Node p = head, q = head;

        while ((q = p.next) != null) {
            if (q.data > max) {
                max = q.data;
                prev = p;
                main = q.next;

            }
            p = q;
            q = p.next;
        }

        return max;
    }

    }

}
