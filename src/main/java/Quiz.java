import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("Wie viele Bundesländer hat die Bundesrepublik Deutschland?");
        System.out.println("15 oder 3 oder 16 oder 30?");

        Scanner scan = new Scanner(System.in);
        int eingabeUser = scan.nextInt();

        /* if(eingabeUser == 16) {
            System.out.println("Die Antwort ist richtig!");
        } else {
            System.out.println("Falsche Antwort!");
        }*/

        switch (eingabeUser) {
            case 15:
                System.out.println("no.");
                break;
            case 3:
                System.out.println("ha ha no.");
                break;
            case 16:
                System.out.println("yes.");
                break;
            case 30:
                System.out.println("wtf!");
                break;
            default:
                System.out.println("Das stand gar nicht zur Wahl.");
                break;
        }
    }
}
