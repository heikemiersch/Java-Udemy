public class Kontrollstrukturen {
    public static void main(String[] args) {
        int score = 5000;

        if(score == 4000) {
            System.out.println("not there yet");
        } else {
            System.out.println("5000 yeah!");
        }

        int score2 = 5;

        if(score2 == 4) {
            System.out.println("The score is " + score2);
        } else if (score2 < 4) {
            System.out.println("The score is smaller than 4, it is " + score2);
        } else {
            System.out.println("The score is bigger than 4, it is " + score2);
        }
    }
}
