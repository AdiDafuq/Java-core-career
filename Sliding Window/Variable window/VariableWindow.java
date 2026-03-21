import java.util.HashSet;
public class VariableWindow
{
    public static void main(String[] args) {
        String str = "abcdef";
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right= 0; right<str.length(); right++ )
        {
            char ch = str.charAt(right);
            while(set.contains(ch))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            int lenght = right-left+1;
            if(lenght>max)
            {
                max = lenght;
            }
        }
        System.out.println(max);
        
    }
}