public class Auto {

    // die klasse, der bauplan, der datentyp, der entscheidet, was wir hier
    // speichern können, auch wenn hier selbst nichts gespeichert wird


    // attributes, fields
    String brand;
    String model;
    int maxVelocity;
    double price;

    // standard constructor (der verfliegt, sobald ich einen eigenen benutze)
    public Auto() {

    }

    // constructor. und dem kann ich in klammern parameter übergeben,
    // sobald ich das tue, werden car1 und car2 in main aber auch argumente wollen,
    // weil da der standard constructor benutzt wird

   public Auto(String brand, String model, int maxVelocity, double price) {
    this.brand = brand;
    this.model = model;
    this.maxVelocity = maxVelocity;
    this.price = price;
   }

   public void comparePrice(int price) {
        if(this.price < price) {
            System.out.println("the " + this.brand + " is cheaper.");
        } else if(this.price > price){
            System.out.println("the " + this.brand + " is more expensive.");
        } else {
            System.out.println("same price.");
        }
   }

}
