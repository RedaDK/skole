package pigs;

public class PigsApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Pigs.");

        PigsGame game = new PigsGame();
        game.printRules();
        System.out.println();

        game.play();

        System.out.println("Thank you for playing Pigs.");
    }

}
