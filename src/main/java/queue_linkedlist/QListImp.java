package queue_linkedlist;

public class QListImp {
    public static void main(String[] args) {
        LinkedQueue lq = new LinkedQueue();

        lq.enQueue(12);
        lq.enQueue(1);
        lq.enQueue(2);
        lq.enQueue(3);
        lq.enQueue(4);
        lq.enQueue(5);
        lq.enQueue(6);
        lq.enQueue(7);
        lq.enQueue(8);
        System.out.println(lq.deQueue());
        System.out.println(lq.deQueue());
        System.out.println(lq.deQueue());
        System.out.println(lq.print());
        lq.enQueue(9);
        lq.enQueue(9);
        lq.enQueue(9);
        lq.enQueue(9);
        lq.enQueue(9);
        lq.enQueue(9);

        System.out.println(lq.print());
//        lq.enQueue(0);
    }
}
