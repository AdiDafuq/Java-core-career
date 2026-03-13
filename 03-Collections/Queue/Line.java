import java.util.LinkedList;
import java.util.Queue;
public class Line
{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queued Elememts: " + queue);
        System.out.println("First Elememt: " + queue.peek());
        System.out.println("First Elememt Removed: " + queue.remove());
        System.out.println("Updated Elements: " + queue);
    }
}
