import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LineInput
{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of Queue: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter Values: ");
            int num = sc.nextInt();
            queue.add(num);
        
        }
        System.out.println("Queue Elements: " + queue);
        System.out.println("Queue Firts Element: " + queue.peek());
        System.out.println("Queue Firts Element Removed: " + queue.remove());
        System.out.println("Updated Queue: " + queue);
    }
}