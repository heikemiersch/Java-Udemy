import java.util.Scanner;

public class EinlesenI {
    public static void main(String[] args) {

        // Scanner also neuer Datentyp, den ich nutzen will, dann scan als var, dann new als Operator,
        // der Scanner als Objekt aus der Klasse erstellt

        // hier übrigens fehler, weil er Scanner als Datentyp nicht kennt also java.util.Scanner importieren.
        // also import ein paket punkt klasse (hier scanner aus dem paket java.util)

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben.");
        // mit dem punkt gehe ich in das objekt in scan hinein...
        double zahl = scan.nextDouble();
        System.out.println("Ihre Zahl lautet : " + zahl + ("."));

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Namen ein.");
        String zeichenkette = scan2.next();
        System.out.println("Bitte geben Sie Ihr Alter ein.");
        int alter = scan2.nextInt();

        System.out.println("Ihr Name lautet " + zeichenkette + ".");
        System.out.println("Sie sind " + alter + " Jahre alt.");
    }
}
