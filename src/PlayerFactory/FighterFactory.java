package PlayerFactory;

import java.util.Scanner;

public class FighterFactory extends PlayerFactory {
    @Override
    public Player makePlayer() {
        Scanner scanner = new Scanner(System. in);

        askForAName = "GRR!!!!  I need a name!!!!!";
        System.out.println(askForAName);
        name = scanner.nextLine();

        askForPower = "GRR!!!!!! Tell me how powerful I am on a scale from 0-10!";
        System.out.println(askForPower);
        power = scanner.nextLine();

        askForAWeapon = "GAR!!! Tell me which weapon I should use?";
        System.out.println(askForAWeapon);
        weapon = scanner.nextLine();

        askForAnOpeningLine = "AND HOW SHOULD I GREET MY DOOMED OPPONENT?";
        System.out.println(askForAnOpeningLine);
        openingLine = scanner.nextLine();

        askForAttackLine = "AND WHAT SHOULD I SAY WHEN I ATTACK? GAR!";
        System.out.println(askForAttackLine);
        attackLine = scanner.nextLine();

        return new Fighter(name, power, weapon, openingLine, attackLine);
    }

}
