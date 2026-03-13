import java.util.Scanner;
class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }
}
class Sum extends Calculator
{
    int add (int a, int b)
    {
        return a + b + 10;
    }
}
public class TheCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Sum();
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Total: " + c.add(x, y));

    }
}