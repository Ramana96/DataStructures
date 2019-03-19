package doublelist;

class Node {

    Node previous;
    Node next;
    int data;


    Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;

    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
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

public class DoubleLinkedList {
    Node head;
    int length;

    DoubleLinkedList() {
        this.head = null;
        this.length = 0;
    }

    ///inserting data into starting

    public void insertAtBegin(int data) {
        Node temp = new Node(data);

        if (this.head == null) {
            head = temp;
            length++;
            return;
        }
        head.previous = temp;
        temp.next = head;
        head = temp;
        length++;

    }


    // inserting at end

    public void insertAtEnd(int data) {

        Node temp = new Node(data);
        Node p = head, q;
        if (this.head == null) {
            head = temp;
            length++;
            return;
        }
        while ((q = p.next) != null) {
            p = q;

        }
        temp.previous = p;
        p.next = temp;
        length++;

    }


    // inserting in the middle

    public void insert(int data, int position) {
        Node temp = new Node(data);
        if (position <= 1) {
            insertAtBegin(data);

        } else if (position >= length) {
            insertAtEnd(data);
        } else {
            Node p = head, q = head;
            for (int i = 1; i < position; i++) {
//                System.out.println("position  "+position);
                p = q;
                q = p.next;

            }
            temp.previous = p;
            temp.next = q;
            p.next = temp;
            q.previous = temp;
            length++;
            return;

        }
    }


    // Delete a node from linked list at the begging
    public void deleteFromBegging() {
        head = head.next;
        head.previous = null;
    }


    // delete a node at the end

    public void deleteAtEnd() {

        Node p = head, q;
        if (this.head == null) {
            System.out.println("no deletion bcz linked list is already empty");
            return;
        }
        while ((q = p.next) != null) {
            p = q;
        }
        Node x = p.previous;
        x.next = null;
        length--;

    }


    // delete at an particular index or position

    public void delete(int position) {
        if (position <= 1) {
            deleteFromBegging();
        } else if (position >= length) {
            deleteAtEnd();
        } else {
            Node p = head, q = head;
            for (int i = 1; i < position; i++) {
                p=q;
                q=p.next;

            }
            q=q.next;
            p.next=q;
            q.previous=p;
            length--;
        }
    }

    //print the list

    public void printDoubleList(Node h) {
        Node q = h;
        while (q != null) {
            h = q;
            System.out.println(h.data);
            Node x = h.previous;

            q = h.next;


        }
        // print in reverse
        System.out.println("reverse order");
//        Node x=h.previous;
//        System.out.println(x.data);
        while (h != null) {
            System.out.println(h.data);
            h = h.previous;
        }
    }

}
