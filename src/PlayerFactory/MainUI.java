package PlayerFactory;

import java.util.Scanner;

public class MainUI {
    public static void main(String[] args) {
        Player player1=getPlayer();
        Player player2=getPlayer();
        Game aGame = new Game();
        aGame.play(5, player1, player2);
    }


    private static Player getPlayer() {
        Scanner scanner = new Scanner(System. in);
        String playerType = scanner.nextLine();
        System.out.println("What kind of player do you want to create? Fighter or Wizard");
        PlayerFactory pf1 = null;
        if (playerType.equals("Fighter")){
            pf1 = new FighterFactory();
            return pf1.makePlayer();

        }
        if (playerType.equals("Wizard")) {

            pf1 = new WizardFactory();
            return pf1.makePlayer();
        }
        return null;
    }
}
