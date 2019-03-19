package circularlinkedlist;

//Circular linked lists are used in managing the computing resources of a computer. We can use
//circular lists for implementing stacks and queues.

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularList {
    Node head;
    int length;

    CircularList() {
        this.head = null;
        this.length = 0;
    }

    //inserting at the beginning
    public void insertAtBegin(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            head.next = temp;
            length++;
            return;

        }
        temp.next = head;
        Node p = head, q = head;
        while ((q = p.next) != head) {
            p = q;
        }
        p.next = temp;
        head = temp;
        length++;


    }


    //insert at the end of the list
    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            head.next = temp;
            length++;
            return;
        }
        Node p = head, q = head;
        while ((q = p.next) != head) {
            p = q;
        }
        p.next = temp;
        temp.next = head;
        length++;

    }


    ///insert ant any position in the middle

    public void insert(int data, int position) {
        Node temp = new Node(data);
        if (position <= 1) {
            insertAtBegin(data);
        } else if (position > length) {
            insertAtEnd(data);
        } else {
            Node p = head, q = head;
            for (int i = 1; i < position; i++) {
                p = q;
                q = p.next;
            }
            p.next = temp;
            temp.next = q;
            length++;

        }


    }

    // delete at the end
    public void deleteAtEnd() {
        if (length == 1) {
            head = null;
            length--;
        } else if (length <= 0) {
            System.out.println("cannot delete because circular list is already empty ");
        } else {
            Node p = head, q = p.next;
            while (q.next != head) {
                p = q;
                q = p.next;
            }
            p.next = head;
            length--;


        }
    }


    //Delete at the beginning

    public void deleteAtBeginning() {
        if (length == 1) {
            head = null;
            length--;
        } else if (length <= 0) {
            System.out.println("cannot delete because circular list is already empty ");

        } else {
            Node p = head, q = p.next;
            while (q.next != head) {
                p = q;
                q = p.next;
            }
            head = head.next;
            q.next = head;
            length--;


        }
    }


    // delete at any position
    public void delete(int position) {
        if (position<=1){
            deleteAtBeginning();
        }
        else if (position>=length){
            deleteAtEnd();
        }
        else {
            Node p=head,q=head;
            for (int i=1;i<position;i++){
                p=q;
                q=p.next;
            }
            q=q.next;
            p.next=q;
            length--;
        }

    }


    ///print the circular linked list

    public void printCircularList(Node h) {
        if (h != null) {
            System.out.println(h.data);
            h = h.next;
            while (h != head) {
                System.out.println(h.data);
                h = h.next;

            }
        }
    }


}
