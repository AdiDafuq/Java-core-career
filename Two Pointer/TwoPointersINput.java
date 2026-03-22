import java.util.*;
public class TwoPointersINput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i =0; i<n; i++)
        {
            
            System.out.println("Enter Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length -  1;
        while(left<right)
        {
            int sum = arr[left] + arr[right];
            if(sum == target)
            {
                System.out.println("Pair: " + arr[left] + " and  " + arr[right]);
                return;
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        System.out.println("No pair found");
    }
}