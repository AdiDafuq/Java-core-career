import java.util.Arrays;
import java.util.Scanner;
public class CheckAnarang
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2))
        {
            System.out.print("Anarang");
        }
        else
        {
            System.out.print("Not Anarang");
        }
    }
}