class Shape
{
    int area()
    {
        return 0;
    }
}
class Square extends Shape
{
    int area()
    {
        int a = 5;
        return a*a;
    }
}
class Rectangle extends Shape
{
    int area()
    {
        int b = 4;
        int c = 5;
        return  c*b;
    }
}
public class Place
{
    public static void main(String[] args)
    {
        Shape s1 = new Square();
        System.out.println(s1.area());
        Shape s2 = new Rectangle();
        System.out.println(s2.area());

    }
}