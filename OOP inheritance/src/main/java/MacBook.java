public class MacBook extends Laptop {

    boolean touchbar;

    public MacBook(String brand, int ram, String cpu, double price, boolean touchbar) {
        super("Apple", 64, "Intel", 800.00);
        this.touchbar = touchbar;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("macbook has started.");
    }

}