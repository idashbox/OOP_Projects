package pokerGameTask1.mainGame;

import pokerGameTask1.player.Player;
import pokerGameTask1.utilsHands.Draw;
import pokerGameTask1.utilsHands.Hand;
import pokerGameTask1.utilsHands.Stud;
import pokerGameTask1.utilsHands.Wild;

public class MainWindow {
    private int game;

    public MainWindow(int game) {
        this.game = game;
    }
    public void refresh(){
        game = 0;
    }
    public void playDrawPoker(Draw draw, Hand hand){
        game++;
        draw.drawCards(hand);
    }
    public void playWildPoker(Wild wild, Hand hand){
        game++;
        wild.drawCards(hand);
    }
    public void playStudPoker(Stud stud, Hand hand){
        game++;
        stud.drawCards(hand);
    }
    public void displayDealButton(PokerGame game){
        System.out.println(game.getBet());
    }
    public void displayPlayerInfo(Player player){
        System.out.println(player.getHand().getCard1());
        System.out.println(player.getHand().getCard2());
        System.out.println(player.getHand().getCard3());
        System.out.println(player.getHand().getCard4());
        System.out.println(player.getHand().getCard5());
        System.out.println(player.getHand().getCard6());

    }
}
