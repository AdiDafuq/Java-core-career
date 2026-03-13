 class Calculator
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
        Calculator math = new Calculator();
        System.out.println(math.add(4,6));
        System.out.println(math.add(4,6, 10));
    }
}
