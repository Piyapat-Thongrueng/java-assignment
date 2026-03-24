public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();
        myCar.drive();
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
