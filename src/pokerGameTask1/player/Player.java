package pokerGameTask1.player;

import pokerGameTask1.utilsHands.Hand;

public class Player {
    private float winnings;
    private Hand hand;
    private boolean drawAllowed;

    public Player(float winnings, String c1, String c2, String c3, String c4, String c5, String c6, boolean drawAllowed) {
        this.winnings = winnings;
        hand = new Hand(c1, c2, c3, c4, c5, c6);
        this.drawAllowed = drawAllowed;
    }

    public float getWinnings(){
        return winnings;
    }
    public void adjustWinnings(float amount){
        winnings+= amount;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public Hand getHand() {
        return hand;
    }
    public boolean drawAllowed(){
        return drawAllowed;
    }
}
