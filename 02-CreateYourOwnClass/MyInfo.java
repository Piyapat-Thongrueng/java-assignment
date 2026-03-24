public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setSpeed(100);
        myCar.displayInfo();

    }
}

class Car {
    private String brand;
    private int speed;

    void setBrand(String newbrand) {
        this.brand = newbrand;
    }

    void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    void displayInfo() {
        System.out.println("Car brand: " + brand + " Speed: " + speed + " km/h");
    }

}
