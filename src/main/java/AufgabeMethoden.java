public class AufgabeMethoden {
    public static void main(String[] args) {

        /* aufgabe:
           1. wert: 3.547
           2. wert: 6.354
           erstelle eine methode, die diese beiden werte multipliziert, die beiden werte
           sollen dabei als parameter übergeben werden
           das ergebnis soll zurückgegeben und in der console ausgegeben werden */

        double num1 = 3.547;
        double num2 = 6.354;

        double result = multiplyNums(num1, num2);
        System.out.println("the result is " + result);
    }




    public static double multiplyNums(double num1, double num2) {
        double result = (num1 * num2);
        return result;
    }
}
