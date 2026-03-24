public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();
        myCar.drive();
        Car myCar2 = new Car("Honda");
        myCar2.start();
        myCar2.drive();
        Airplane myAirplane = new Airplane("Airbus");
        myAirplane.start();
        myAirplane.fly();
    }
}

class Vehicle {
    private String brand;

    Vehicle(String newbrand) {
        this.brand = newbrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newbrand) {
        this.brand = newbrand;
    }

    public void start() {
        System.out.println(brand + " " + "is starting");
    }
}

class Car extends Vehicle {

    Car(String newbrand) {
        super(newbrand);
    }

    public void drive() {
        System.out.println(super.getBrand() + " " + "is driving");
    }
}

class Airplane extends Vehicle {

    Airplane(String newbrand) {
        super(newbrand);
    }

    public void fly() {
        System.out.println(super.getBrand() + " " + "is flying");
    }
}
