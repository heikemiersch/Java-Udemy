public class MacBook extends Notebook {

    boolean touchbar;

    public MacBook(String brand, int ram, String cpu, double price, boolean touchbar) {
        super(brand, ram, cpu, price);
        this.touchbar = touchbar;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("macbook has started.");
    }
}
