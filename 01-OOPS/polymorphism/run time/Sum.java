class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }
}
class Extra extends Calculator
{
    int add(int a, int b)
    {
        return a + b + 10;
    }
}
public class Sum
{
    public static void main(String[] args)
    {
        Calculator math = new Extra();
        System.out.println("Total is : " + math.add(4, 6));
    }
}