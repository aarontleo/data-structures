/*
Operations on a Stack
1. Push - add an element to the top of the stack
2. Pop - remove an element from the top of the stack
3. Peek - Get the top item
4. isFull - check to see if the stack is full
5. isEmpty - check to see if the stack is empty
*/

import java.util.Arrays;

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
        if (isFull()) {
            System.out.println("Stack Full!");
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed Element: " + element);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty!");
        }
        System.out.println("Popped Element: " + stackArray[top]);
        return stackArray[top--];
    }

    public boolean isFull() {
        return top == capacity - 1 ? true : false;
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public void display() {
        System.out.println("----------------");
        if (isEmpty()) {
            System.out.println("Stack Empty!");
        } else {
            System.out.println(Arrays.toString(stackArray));
        }
        
    }

}