import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class IterInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of values: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            System.out.print("Enter Values: ");
            int num = sc.nextInt();
            list.add(num);
        }
        Iterator<Integer> it = list.iterator();
        System.out.println("Elements Are: ");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}