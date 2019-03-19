package linkedlist_stack.stack;

public class LinkedStackImp {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack(11);
//        System.out.println(linkedStack.isEmpty());
        linkedStack.push(1);
//        linkedStack.push(2);
//        linkedStack.push(3);
//        linkedStack.push(4);
//        linkedStack.push(5);
//        linkedStack.push(6);
//        linkedStack.push(7);
//        linkedStack.push(8);
//        linkedStack.push(9);

//        System.out.println(linkedStack.isEmpty());

        linkedStack.push(11);
//        System.out.println(linkedStack.printStack());
//        linkedStack.push(12);
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
//        linkedStack.pop();
//        linkedStack.pop();

//        System.out.println(linkedStack.printStack());

//        linkedStack.pop();
        linkedStack.push(10);
        System.out.println(linkedStack.pop());
//        System.out.println(linkedStack.printStack());

    }
}
