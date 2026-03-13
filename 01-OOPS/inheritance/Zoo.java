class Animal
{
    void eats()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void barks()
    {
        System.out.println("Dog is barking");
    }
}
public class Zoo
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.eats();
        dog.barks();
    }
}