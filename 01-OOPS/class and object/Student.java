public class Student
{
    String name;
    int marks;
    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
    void increaseMarks(int more)
    {
        marks += more;
        System.out.println(name + " marks increased");
        System.out.println("              ");
    }
    void showResult()
    {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println(".............");
    }
    public static void main(String[] args)
    {
        Student s1 = new Student("Ram", 40);
        Student s2 = new Student("Shyam", 60);
        s1.showResult();
        s2.showResult();
        s1.increaseMarks(60);
        s2.increaseMarks(40);
        s1.showResult();
        s2.showResult();
        }
}