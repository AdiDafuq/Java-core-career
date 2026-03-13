import java.util.Scanner;
class AgeException extends RuntimeException
{
     AgeException(String msg)
    {
        super(msg);
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if (age<18)
            {
                System.out.println("Not eligible to vote");
            }
            else
            {
                System.out.println("You can vote");
            }
        }
        catch(AgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}