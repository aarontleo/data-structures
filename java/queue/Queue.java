/* 
Operations on a Queue
1. Enqueue - add an item to the queue, overflow condition if queue is full
2. Dequeue - remove and item from the queue
    a. Popped in the same order they are pushed (FirstInFirstOut - FIFO)
3. Peek - Get the head item
4. isFull - check to see if the queue is full
5. isEmpty - check to see if the queue is empty

Time Complexity:
1. Enqueue (Insertion) - O(1) , constant time
2. Dequeue (Deletion) - O(1) , constant time
3. Search - O(n) , constant time 

Space Complexity - O(n) , constant
*/

public class Queue {
    int front, rear;
    int size = 0;
    int capacity;
    int queueArray[];

    public Queue(int queueSize) {
        this.capacity = queueSize;
        front = -1;
        rear = -1;
        queueArray = new int[this.capacity];
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue Full!");
        } else {
            if (front == -1) 
                front = 0;
            rear++;
            queueArray[rear] = element;
            size++;
            System.out.println("Added Element: " + element + " to Queue");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty!");
        } else {
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
                size--;
                System.out.println("Dequeued Element!");
            }
        }

    }

    public boolean isFull() {
        if (size == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }


}