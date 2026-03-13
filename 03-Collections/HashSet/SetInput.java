import java.util.HashSet;
import java.util.Scanner;
public class SetInput
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashset = new HashSet<>();
        System.out.print("Enter the number of Values to be used: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++ )
        {
            System.out.print("Enter Values: ");
            int num = sc.nextInt();
            hashset.add(num);
        }
        System.out.println("HashSet Values: " + hashset);
    }

}