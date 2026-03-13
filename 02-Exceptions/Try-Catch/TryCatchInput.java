import java.util.Scanner;
public class TryCatchInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            System.out.println("Your number is: " + num);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Number");
        }
        System.out.println("Program Finished");
    }
}