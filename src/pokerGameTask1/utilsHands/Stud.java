package pokerGameTask1.utilsHands;

import pokerGameTask1.mainGame.PokerGame;
import pokerGameTask1.player.Dealer;
import pokerGameTask1.player.Player;

import java.util.ArrayList;


public class Stud extends PokerGame {
    public Stud() {
    }
    private Player player;
    private Dealer dealer;
    private int bet = 0;

    public void setPlayer(float winnings, String c1, String c2, String c3, String c4, String c5, String c6, boolean drawAllowed) {
        this.player = new Player(winnings, c1, c2, c3, c4, c5, c6, drawAllowed);
    }
    public void setDealer(ArrayList<String> arrayOfCards) {
        this.dealer = new Dealer(arrayOfCards);
    }

    public Player abstractDeal(){
        player.adjustWinnings(-bet);
        return player;
    }
    public void reset(){
        player = null;
    }
    public void setBet(float amount){
        bet+= amount;
    }
    public int getBet(){
        return bet;
    }
    public Player getPlayer() {
        return player;
    }
    public Player drawCards(Hand hand){
        player.setHand(dealer.getHand(hand));
        return player;
    }
}
