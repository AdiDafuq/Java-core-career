import java.util.ArrayList;
import java.util.Scanner;
public class MainInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println("Your Array Values Are: " + list);
    }
}