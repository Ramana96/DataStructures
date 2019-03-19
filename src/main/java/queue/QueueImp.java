package queue;

public class QueueImp {
    public static void main(String[] args) {
        QueueDef q = new QueueDef(13);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(11);
        q.enQueue(12);
//        q.deQueue();
//        q.deQueue();
//        q.enQueue(5);
        System.out.println(q.printQueue());
    }
}
