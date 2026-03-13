import java.util.Scanner;
import java.util.Stack;
public class BagInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the number of stacks you want to push: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Numbers:");
            int num = sc.nextInt();
            stack.push(num);
        }
        System.out.println("Stacks Elements Are: " + stack);
        System.out.println("Top Element is : " + stack.peek());
        System.out.println("Popped Element is : " + stack.pop());
        System.out.println("Stack After Popped Element is : " + stack);
    }
}