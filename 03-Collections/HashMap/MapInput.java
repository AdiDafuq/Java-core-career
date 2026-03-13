import java.util.HashMap;
import java.util.Scanner;
public class MapInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        System.out.println("Enter number of student: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <=n; i++) {
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            students.put(id, name);
            
        }
        System.out.println("Student data: ");
        System.out.println(students);
    }
}