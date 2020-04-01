public class Laptop {

    int ram;
    int price;
    String brand;

    public Laptop(int ram, int price, String brand) {
        this.ram = ram;
        this.price = price;
        this.brand = brand;
    }

    // objektmethoden (im gegensatz zu class methoden, die kein objekt brauchen,
    // zum beispiel "static") leben nur, wenn vorher objekt erstellt ist
    // static ist quasi wie global (vielleicht brauch ich das ja für alle objekte)

    public void display() {
        System.out.println("the " + this.brand + " has " + this.ram + " ram and costs " + this.price + " Euros");
    }
}
