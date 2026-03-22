public class AllPrefix
{
    public static void main(String[] args) {
        String str = "coding";
        for(int i = 1; i<=str.length(); i++)
        {
            String prefix = str.substring(0, i);
            System.out.println(prefix);
        }
    }
}