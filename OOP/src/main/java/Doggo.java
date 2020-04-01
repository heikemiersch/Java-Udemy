public class Doggo {

    String name;
    int age;
    String breed;

    // constructors
    public Doggo() {

    }

    public Doggo(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // methods
    public void bark() {
        System.out.println(this. breed + " " + this.name + " says 'whoof whoof'");
    }
}
