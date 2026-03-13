import java.util.Scanner;
class CalculatorA
{
    int add(int a, int b)
    {
        return a + b;
    }
    int add(int a, int b, int c)
    {
        return a + b + c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CalculatorA d1 = new CalculatorA();
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Total: "+d1.add(a, b));
        System.out.println("...........................");
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Total: "+d1.add(x, y, z));
    }
}