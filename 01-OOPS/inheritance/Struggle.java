class Person
{
    void sleep()
    {
        System.out.println("Person is sleeping");
    }
}
class Student extends Person
{
    void study()
    {
        System.out.println("Student is studing");
    }
}
public class Struggle
{
    public static void main(String[] args)
    {
        Student boy = new Student();
        boy.sleep();
        boy.study();
    }
}