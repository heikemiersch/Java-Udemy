public class Methoden {

    public static void main(String[] args) {
        /*for(int i = 1; i <= 10; i++) {
            createPlayer();
            }*/
        createPlayer("Tim", 100);
        createPlayer("Tom", 90);
        }

    /* private static void createPlayer() {
        String playerName = "Tom";
        int playerLifePoints = 100;
        System.out.println("Player has been created");
    }*/

    public static void createPlayer(String name, int lifePoints) {
        String playerName = name;
        int playerLifePoints = lifePoints;
        System.out.println(playerName + " " + playerLifePoints);
    }
}



