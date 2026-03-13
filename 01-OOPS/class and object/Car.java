 class Car {

    String color;  
    int speed;      
    Car(String color, int speed) {
        this.color = color;     
        this.speed = speed;
    }

    void accelerate(int amount) {
        speed += amount;        
        System.out.println(color + " car accelerated.");
    }

    void brake(int amount) {
        speed -= amount;        
        System.out.println(color + " car slowed down.");
    }

    void showInfo() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("----------------");
    }

    
    public static void main(String[] args) {

        Car car1 = new Car("Blue", 40);
        Car car2 = new Car("Black", 80);

        car1.showInfo();
        car2.showInfo();

        car1.accelerate(30);
        car2.brake(20);

        car1.showInfo();
        car2.showInfo();
    }
}