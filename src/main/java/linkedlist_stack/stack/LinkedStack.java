package linkedlist_stack.stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedStack {
    Node head;
    int top;
    public static int DEFAULT_CAPACITY = 10;
    int capacity;


    LinkedStack() {
        this.head = null;
        capacity = DEFAULT_CAPACITY;
        this.top = -1;

    }

    LinkedStack(int capacity) {
        this.head = null;
        this.capacity = capacity;
        this.top = -1;

    }


    //check whether stack is empty or not

    public boolean isEmpty() {
        return top == -1;
    }


    // push or insert at the end
    public void push(int data) {
        if (top < capacity - 1) {
            Node temp = new Node(data);
            Node p, q = null;

            if ((isEmpty())) {
                head = temp;
                temp = null;
                top++;
                return;
            }
            p = head;

            while ((q = p.next) != null) {
                p = q;

//            System.out.println(t.data);
            }
            p.next = temp;
            top++;
//        System.out.println(q.data);
        } else {
            try {
                throw new Exception("cannot push into filled stack");
            } catch (Exception e) {
                e.printStackTrace();
//                System.out.println(e.getMessage());
            }

        }
    }


    // removing the element or pop
    public int pop() {

        if (!isEmpty()) {
            Node p = head, q = head;
            for (int i = 1; i <= top; i++) {
                p = q;
                q = p.next;

            }
            p.next = null;
            top--;
            return q.data;
        } else {
            try {
                throw new Exception("cannot be popped from empty stack");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Integer.MIN_VALUE;
    }


    // printing the stack

    public String printStack() {
        String s = "[";
        if(!isEmpty()) {
            Node p = this.head;
            s = s + p.data;
            for (int i = 1; i <= top; i++) {
                p = p.next;
                s = s + "," + p.data;
            }
        }
        return s + "]";
    }
}
