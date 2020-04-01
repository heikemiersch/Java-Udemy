
public class Laptop {
    String brand;
    int ram;
    String cpu;
    double price;

    public Laptop(String brand, int ram, String cpu, double price) {
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.price = price;
    }

    public void start() {
        System.out.println("computer has started");
    }

}