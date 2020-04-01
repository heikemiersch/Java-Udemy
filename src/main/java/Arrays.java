import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


    int [] something = new int[6];

        System.out.println("Please type in something");

        for(int i = 0; i < something.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int inputUser = scanner.nextInt();
            something[i] = inputUser;

        }
        for (int i = 0; i < something.length; i++) {
            System.out.println(something[i]);
        }
    }
}
