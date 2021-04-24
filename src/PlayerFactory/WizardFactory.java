package PlayerFactory;

import java.util.Scanner;

public class WizardFactory extends PlayerFactory {
    @Override
    public Player makePlayer() {
        Scanner scanner = new Scanner(System. in);

        askForAName = "How now fine employer? How might you refereth to me?";
        System.out.println(askForAName);
        name = scanner.nextLine();

        askForPower = "And what, on a scale of 1-10, is the extent of my power?";
        System.out.println(askForPower);
        power = scanner.nextLine();

        askForAWeapon = "Do I parry with a wand? a staf? Something else you might suggest?";
        System.out.println(askForAWeapon);
        weapon = scanner.nextLine();

        askForAnOpeningLine = "And pray, how should I introduce myself, if I'm asked who I am?";
        System.out.println(askForAnOpeningLine);
        openingLine = scanner.nextLine();

        askForAttackLine = "Is there anything you would like me to say before I make my play?";
        System.out.println(askForAttackLine);
        attackLine = scanner.nextLine();

        return new Wizard(name, power, weapon, openingLine, attackLine);
    }
}
