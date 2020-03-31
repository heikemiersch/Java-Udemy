import com.sun.tools.javac.comp.Resolve;

import java.util.Scanner;

public class EinlesenII {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie Ihren Namen und Ihr Alter ein.");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int alter = scan.nextInt();

        System.out.println("Name ist: " + name + "| Alter ist: " + alter);

        System.out.println("Bitte tippen Sie Ihre Daten ein.");

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        char gender = scanner.next().charAt(0);
        int age = scanner.nextInt();
        long phone = scanner.nextLong();





        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);




    }
}

