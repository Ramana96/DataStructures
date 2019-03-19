package doublelist;

public class DouListImp {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.insertAtBegin(10);
        doubleLinkedList.insertAtBegin(100);
//        doubleLinkedList.insertAtBegin(0);
//        doubleLinkedList.insertAtBegin(120);
//        doubleLinkedList.insert(122,2);
//        doubleLinkedList.insert(144,2);




//        doubleLinkedList.insertAtEnd(11);
//        doubleLinkedList.insertAtEnd(11);
//        doubleLinkedList.insertAtEnd(16);
        doubleLinkedList.insertAtEnd(11);
//        doubleLinkedList.insertAtEnd(24);
//        doubleLinkedList.insertAtEnd(1441);
//        doubleLinkedList.insert(122,4);

        doubleLinkedList.printDoubleList(doubleLinkedList.head);
        System.out.println("length of list is "+doubleLinkedList.length);

//        doubleLinkedList.deleteFromBegging();

//        doubleLinkedList.deleteAtEnd();

        doubleLinkedList.delete(2);
        doubleLinkedList.delete(2);

        System.out.println(" this is after deleting");
        doubleLinkedList.printDoubleList(doubleLinkedList.head);

        System.out.println("length of list is "+doubleLinkedList.length);

    }
}
