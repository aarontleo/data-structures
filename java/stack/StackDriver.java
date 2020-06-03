public class StackDriver {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);
        s.pop();
        s.push(9);
        s.display();

    }
}