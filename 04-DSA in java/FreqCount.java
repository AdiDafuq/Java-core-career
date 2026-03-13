import java.util.HashMap;
import java.util.Scanner;
public class FreqCount
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nuber of elemets: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter elemets: ");
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i<n; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i] + 1));
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Frequency Count: ");
        System.out.println(map);
      }
}