package PlayerFactory;

import java.util.Scanner;

public class Wizard extends Player {



    public Wizard(String name, String power, String weapon, String openingLine, String attackLine){
        super(name, power, weapon, openingLine, attackLine);
    }


    @Override
    public void play(){
        super.play();
        System.out.println("Abracadabra!");
    }
}
