package PlayerFactory;

public abstract class Player {
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

   public Player(String name, String power, String weapon,String  openingLine, String attackLine){
       this.name = name;
       this.power = power;
       this.weapon = weapon;
       this.openingLine = openingLine;
       this.attackLine = attackLine;
   }

    void play(){
        System.out.println(attackLine);
        System.out.println("I will now use my "+weapon+" upon you with power level "+power);
    }



    public void introduce(){
        System.out.println("Hi! I'm "+name);
        System.out.println(openingLine);
    }
}
