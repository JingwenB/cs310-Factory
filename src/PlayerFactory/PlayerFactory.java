package PlayerFactory;

public abstract class PlayerFactory {
    String askForAName;
    String name;
    String askForPower;
    String power;
    String askForAWeapon;
    String weapon;
    String askForAnOpeningLine;
    String openingLine;
    String askForAttackLine;
    String attackLine;

    abstract Player makePlayer();
}
