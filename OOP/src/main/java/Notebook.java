public class Notebook {

        String brand;
        int ram;
        String cpu;
        double price;

        public Notebook(String brand, int ram, String cpu, double price) {
            this.brand = brand;
            this.ram = ram;
            this.cpu = cpu;
            this.price = price;
        }

        public void start() {
            System.out.println("notebook has started.");

        }
}
