public class QueueDriver {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(6);
        q.enqueue(10);
        q.dequeue();
        
    }
}