import java.util.Stack;
public class Bag
{
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println("Stack Elements: " + stack);
    System.err.println("Top Element: " + stack.peek());
    System.err.println("Popped Element: " + stack.pop());
    System.out.println("Stack After Pop: " + stack);
    }
}