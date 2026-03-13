class School
{
    String name;
    School(String name)
    {
        this.name = name;
    }
    private int marks = 0;
    public void increaseMarks(int number)
    {
        if(number>0)
        {
            marks = marks + number;   
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
    public void decreaseMarks(int number)
    {
        if(number>0 && number<=marks)
        {
            marks = marks - number;   
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
    public void myResult()
    {
        System.out.println(name + marks);
        System.out.println("......................");
    }
}
public class Student
{
    public static void main(String[] args)
    {
        School s1 = new School("Aditya ");
        School s2 = new School("Aditi ");
        s1.myResult();
        s2.myResult();
        s1.increaseMarks(100);
        s2.increaseMarks(80);
        s1.myResult();
        s2.myResult();
        s1.decreaseMarks(20);
        s2.decreaseMarks(20);
        s1.myResult();
        s2.myResult();
    }
}
