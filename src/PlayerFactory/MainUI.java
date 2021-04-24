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
        if (playerType.equals("Fighter"))
            return new Fighter();
        if (playerType.equals("Wizard"))
            return new Wizard();
        return null;
    }
}