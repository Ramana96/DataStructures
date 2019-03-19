package stack;

public class StackArray {
    public static int CAPACITY = 10;
    int top = -1, cap;
    int stackImp[];


    StackArray() {
        this.cap = CAPACITY;
        stackImp = new int[CAPACITY];
    }

    StackArray(int size) {
        this.cap = size;
        stackImp = new int[size];

    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(int data) {
        if (top >= (cap - 1)) {
            try {
                throw new Exception("stack is full");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            stackImp[++top] = data;
        }

    }

    public int pop() {
        if (isEmpty()) {
            try {
                throw new Exception("this is already empty");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return Integer.MIN_VALUE;
            }
        }

        int element = stackImp[top--];

        return element;

    }

    public String toString() {
        if (!isEmpty()) {
            String s = "[" + stackImp[0];
            for (int i = 1; i <= top; i++) {
                s = s + "," + stackImp[i];
            }

            return s + "]";
        }
        else {
            return "the stack is empty";
        }
    }
}