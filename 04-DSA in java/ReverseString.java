import java.util.Scanner;
public class ReverseString

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr String: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int n = arr.length;
        for(int i = 0; i<n/2; i++)
        {
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("Reevrsed String: ");
        for(char c : arr)
        {
            System.out.println(c);
        }

    }
}