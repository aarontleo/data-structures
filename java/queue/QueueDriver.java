public class QueueDriver {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(6);
        q.enqueue(10);
        q.dequeue();
        q.enqueue(234);
        q.enqueue(566);
        q.enqueue(53);
        q.dequeue();
        q.display();
    }
}