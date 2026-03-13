abstract class Vechile
{
    abstract void start();
    
}
class Car extends Vechile
{
    void start()
    {
        System.out.println("Car starts with key");
    }
}
class Bike extends Vechile
{
    void start()
    {
        System.out.println("Bike starts with kick");
    }
}
public class Transport
{
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c  = new Car();
        b.start();
        c.start();
    }
}