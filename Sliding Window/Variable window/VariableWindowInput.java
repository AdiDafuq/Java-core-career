import java.util.HashSet;
import java.util.Scanner;
public class VariableWindowInput
{
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right<str.length(); right++)
        {
            char ch = str.charAt(right);
            while(set.contains(ch))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            int length = right - left + 1;
            if (length>max)
            {
                max = length;
            }
        }
        System.out.println(max);
    }
}