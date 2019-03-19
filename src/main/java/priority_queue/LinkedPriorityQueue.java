package priority_queue;

public class LinkedPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.enQueue(5555);
        priorityQueue.enQueue(44);
//        priorityQueue.enQueue(333);
//        priorityQueue.enQueue(444);
//        priorityQueue.enQueue(555);
//        priorityQueue.enQueue(666);
        priorityQueue.enQueue(1);
        priorityQueue.enQueue(2);


        priorityQueue.enQueue(3);

        priorityQueue.enQueue(4);
        priorityQueue.enQueue(555);
//        priorityQueue.enQueue(1);
//        priorityQueue.enQueue(1);
        System.out.println(priorityQueue.max());

        System.out.println(priorityQueue.deQueue());
        System.out.println(priorityQueue.max());
//        System.out.println(priorityQueue.deQueue());
//        System.out.println(priorityQueue.deQueue());
//        System.out.println(priorityQueue.deQueue());

        System.out.println();
        priorityQueue.printQueue();


    }
}
