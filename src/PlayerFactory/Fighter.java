package PlayerFactory;

import java.util.Scanner;

public class Fighter extends Player {


    public Fighter(String name, String power, String weapon,String  openingLine, String attackLine){
        super(name,power, weapon, openingLine, attackLine);
    }


    @Override
    void play() {
        super.play();
        System.out.println("KAPOW!");
    }
}
