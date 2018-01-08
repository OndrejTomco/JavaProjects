package sk.sovy.java;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("audi a8");
        car1.setConsumption(9.9f);
        car1.printInfo();

        Car car2 = new Car("skoda 120L", 7.0f);
        car2.printInfo();
        car2.increaseSpeed();
        car2.turnOn();
        car2.increaseSpeed();
        car2.printInfo();
        System.out.println("naklady na cestu kosice - praha" + car2.getPrice(1600, 1.33f));
    }
}
