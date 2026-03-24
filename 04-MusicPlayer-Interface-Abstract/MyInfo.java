public class MyInfo {
    public static void main(String[] args) {

        CDPlayer myCDPlayer = new CDPlayer("Sony");
        SmartPhone mySmartPhone = new SmartPhone("Apple");

        System.out.println("=== CDPlayer ===");
        myCDPlayer.info();
        myCDPlayer.connect();
        myCDPlayer.play();

        System.out.println("=== SmartPhone ===");
        mySmartPhone.info();
        mySmartPhone.connect();
        mySmartPhone.play();
    }
}

interface Playable {
    void play();
}

abstract class MusicDevice {
    private String brand;

    MusicDevice(String newbrand) {
        this.brand = newbrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String newbrand) {
        this.brand = newbrand;
    }

    void info() {
        System.out.println("music device brand: " + brand);
    }

    abstract void connect();
}

class CDPlayer extends MusicDevice implements Playable {

    CDPlayer(String newbrand) {
        super(newbrand);
    }

    @Override
    public void connect() {
        System.out.println("CDPlayer is connecting to the CD-ROM ");
    }

    @Override
    public void play() {
        System.out.println("CDPlayer is playing from the CD-ROM player");
    }
}

class SmartPhone extends MusicDevice implements Playable {

    SmartPhone(String newbrand) {
        super(newbrand);
    }

    @Override
    public void connect() {
        System.out.println("SmartPhone is connecting to the bluetooth");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone is playing from Spotify");
    }
}
