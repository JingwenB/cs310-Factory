package PlayerFactory;

public class Game {
    public void play(int rounds, Player playerOne, Player playerTwo){
        playerOne.introduce();
        playerTwo.introduce();
        for(int i=0; i<rounds; i++){
            playerOne.play();
            playerTwo.play();
        }
    }
}
