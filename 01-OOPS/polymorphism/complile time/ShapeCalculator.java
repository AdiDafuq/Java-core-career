class ShapeCalculator
{
    int area(int a)
    {
        return a*a;
    }
    int area(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        ShapeCalculator calc = new ShapeCalculator();
        System.out.println("Total: " + calc.area(4)+" m^2");
        System.out.println("Total: " + calc.area(4, 5)+" m^2");
    }
}