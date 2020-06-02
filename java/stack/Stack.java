/*
Operations on a Stack
1. Push - add an element to the top of the stack
2. Pop - remove an element from the top of the stack
3. Peek - Get the top item
4. isFull - check to see if the stack is full
5. isEmpty - check to see if the stack is empty
*/
public class Stack {
    int top;
    int capacity;
    int stackArray[];

    public Stack(int stackSize) {
        this.capacity = stackSize;
        this.top = -1;
        this.stackArray = new int[stackSize];
    }

    public void push(int element) {

    }

    public void pop() {
        
    }

    public boolean isFull() {
        return top == capacity - 1 ? true : false;
    }

    public void isEmpty() {
        top == -1;
    }

}