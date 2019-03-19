package com.modak.Listnode;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList1 {
    public Node head;
    public int length;

    public LinkedList1() {
        this.head = null;
        this.length = 0;

    }


    // insert the node at the beginning of linked list
    public void insertAtBegin(int data) {
        Node temp = new Node(data);
        if (this.head == null) {
            head = temp;
            temp = null;
            length++;
            return;
        }
        temp.next = head;
        head = temp;
        temp = null;
        length++;
    }


    // insert the node at the end of the list

    public void insertAtEnd(int data) {
        Node temp = new Node(data);
        Node p, q = null;

        if (this.head == null) {
            head = temp;
            temp = null;
            length++;
            return;
        }
        p = head;

        while ((q = p.next) != null) {
            p = q;

//            System.out.println(t.data);
        }
        p.next = temp;
        length++;
//        System.out.println(q.data);
    }


    // Insert at the any point on the list

    public void insert(int data, int position) {
        Node temp = new Node(data);
        if (position < 0) {
            insertAtBegin(data);
        } else if (position > length) {
            insertAtEnd(data);
        } else {
            Node p, q = head;
            int i;
            for (p = head, i = 1; i < position - 1; i++) {
                q = p.next;

                p = q;

            }
            q = q.next;
            p.next = temp;

            temp.next = q;
            length++;


        }
    }

    public void printLinkedList(Node h) {
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }


    //deleting at the node at any position\

    public void delete(int position) {
        if (this.head == null) {
            System.out.println("no elements cannot be deleted");
            return;
        }

        if (position <= 1) {
            this.head = this.head.next;
            length--;
            return;
        } else if (position >= length) {
            int i = 1;
            Node p = head;
            if (length <= position) {
                while (i < length - 1) {
                    p = p.next;
                    i++;

                }
                p.next = null;
                length--;
            }
        } else {
            Node q = head, p = head;
            for (int i = 1; i < position; i++) {
                q = p.next;
                if (i != position - 1) {
                    p = q;
                }
            }
            q = q.next;
            p.next = q;
            length--;

        }


    }


}