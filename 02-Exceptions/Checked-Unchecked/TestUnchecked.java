import java.io.FileReader;
public class TestUnchecked
{
    public static void main(String[] args)
    {
        try
        {
            FileReader f = new FileReader("dat.txt");
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Error Happened");
        }
    }
}