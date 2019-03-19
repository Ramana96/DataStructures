package com.modak.ListImp;
import com.modak.Listnode.*;



public class LinkedListSimple {

    public static void main(String[] args) {

        LinkedList1 obj = new LinkedList1();
        obj.insertAtBegin(10);
        obj.insertAtBegin(20);
        obj.insertAtBegin(30);
//        obj.insertAtBegin(40);
//        obj.insertAtBegin(50);
//        obj.insertAtBegin(60);
//        obj.insertAtEnd(110);
//        obj.insertAtEnd(110);
//        obj.insertAtEnd(110);
        obj.insert(2, 4);
        obj.insert(22, -9);
        obj.insert(266, 90);

        obj.printLinkedList(obj.head);

        System.out.println("length of list is   " + obj.length);
//        obj.delete(0);
//
//        obj.printLinkedList(obj.head);
//        System.out.println("length of list is   " + obj.length);
//        System.out.println("after deleting at end");
//        obj.delete(99);
//        obj.printLinkedList(obj.head);
////        obj.insert(00, 32);
//
//
//        System.out.println("length of list is   " + obj.length);

        obj.delete(2);

        obj.printLinkedList(obj.head);
        System.out.println("  length  "+obj.length);

        obj.delete(1);
        obj.delete(999);
        obj.delete(3);

        obj.printLinkedList(obj.head);
        System.out.println("  length  "+obj.length);



    }
}
