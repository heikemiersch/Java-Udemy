import java.io.InputStream;
import java.util.Scanner;

public class MiniMatheQuizApp {
    public static void main(String[] args) {
        String [] questions = {"5 plus 4", "3 times 4", "3 plus 12", "7 times 6"};
        int [] answers = {9, 12, 15, 42};

        int count = 0;
        while(count < questions.length) {
            System.out.println(questions[count]);

            Scanner scan = new Scanner(System.in);
            int inputUser = scan.nextInt();

            if(inputUser == answers[count]) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("incorrect, please try again");
            }
        }
    }

}
