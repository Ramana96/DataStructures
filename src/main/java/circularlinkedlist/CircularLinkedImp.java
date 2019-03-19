package circularlinkedlist;

public class CircularLinkedImp {
    public static void main(String[] args) {
        CircularList circularList = new CircularList();
//        circularList.insertAtBegin(10);
        circularList.insertAtBegin(12);
        circularList.insertAtBegin(16);
//        circularList.insertAtEnd(100);
//        circularList.insertAtEnd(200);
//        circularList.insertAtEnd(300);
//        circularList.insertAtBegin(16);
        circularList.insertAtBegin(12);
//        circularList.insertAtBegin(156);
//        circularList.insertAtEnd(119);

        circularList.insert(1000, 3);
        circularList.insert(100, 3);
        circularList.insert(10, 3);
//        circularList.insert(5, 5);
//        circularList.insert(333, 3);


        circularList.printCircularList(circularList.head);
        System.out.println("length of the circular linked list is " + circularList.length);

        circularList.delete(1);
        circularList.delete(3);

        circularList.delete(5);


        circularList.printCircularList(circularList.head);
        System.out.println("length of the circular linked list is " + circularList.length);

//        circularList.deleteAtEnd();
//
//
//
//        circularList.printCircularList(circularList.head);
//        System.out.println("length of the circular linked list is " + circularList.length);
//        circularList.deleteAtBeginning();
//
//        circularList.printCircularList(circularList.head);
//        System.out.println("length of the circular linked list is " + circularList.length);


    }
}
