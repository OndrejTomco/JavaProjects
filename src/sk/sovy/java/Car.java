package sk.sovy.java;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float consumption;

    public Car(){
        speed = 0;
        engine = false;
        consumption = 7.9f;
        brand = null;
    }

    public Car(String brand, float consumption){
        speed = 0;
        engine = false;
        this.consumption = consumption;
        this.brand = brand;
    }

    public void setBrand(String value){
        brand = value;
    }

    public void setConsumption(float consumption){
        this.consumption = consumption;
    }

    public void printInfo(){
        System.out.println("brand: "+brand + "  speed" + speed );
    }
    public void turnOn(){
        engine = true;
    }
    public void turnOff(){
        engine = false;
    }

    public void increaseSpeed() {
        if (engine) {
            speed += 10;
        }
    }
    public void decreaseSpeed(){
            speed -= 10;
            if(speed < 0){
                speed = 0;
            }
        }
    public void handBrake(){
        speed = 0;
    }

    public float getPrice(int distance, float costPerLiter){
        float price = distance*consumption*costPerLiter/100;
        return price;

    }


}
