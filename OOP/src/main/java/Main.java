public class Main {

    public static void main(String[] args) {

        Auto car1 = new Auto();
        // car1 ist nun die referenzvariable, sie hat die referenz gespeichert,
        // die zum objekt führt, das wir in new Auto finden
        // (hier standard constructor verwendet)
        car1.brand = "Porsche";
        car1.model = "911";
        car1.maxVelocity = 330;
        car1.price = 120500;

        // the other constructor (with parameters and arguments)
        Auto car2 = new Auto("Aston Martin", "Vantage", 314, 154500);

        System.out.println("The first car is the " + car1.brand + " " + car1.model + ".");
        System.out.println("Its max velocity is " + car1.maxVelocity + ".");
        System.out.println("You have to pay " + car1.price + " Euros.");

        System.out.println("The second car is the " + car2.brand + " " + car2.model + ".");
        System.out.println("Its max velocity is " + car2.maxVelocity + ".");
        System.out.println("You have to pay " + car2.price + " Euros.");

        // hier wird die eingabe in klammern mit dem preis von car1 verglichen
        car1.comparePrice(100000);

        // i know this is not pretty but i need to keep cars and doggos apart
        System.out.println("-------------------------------------");

        Doggo dog1 = new Doggo("Lala", 3, "Dachshund");
        dog1.bark();

        Doggo dog2 = new Doggo("Toni", 2, "Pitbull");
        // methoden werden immer in der class gemacht und von objekten aufgerufen
        dog2.bark();

        System.out.println("-------------------------------------");

        Laptop model1 = new Laptop(32, 400, "Dell");
        Laptop model2 = new Laptop(64, 500, "Acer");

            model1.display();
            model2.display();

    }


}
