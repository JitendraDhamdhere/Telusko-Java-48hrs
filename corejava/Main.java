package corejava;

class Car {

    String color = "Red";

    void drive() {
        System.out.println("Driving...");
    }
}

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        System.out.println(c.color);
    }
}
