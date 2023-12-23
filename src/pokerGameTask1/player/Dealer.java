package pokerGameTask1.player;

import pokerGameTask1.utilsHands.Hand;

import java.util.ArrayList;
import java.util.Random;

public class Dealer {
    private ArrayList<String> arrayOfCards;

    public void shuffle(){
        for (int i = 0; i < arrayOfCards.size(); i++){
            Random rd = new Random();
            int ind = rd.nextInt(arrayOfCards.size());
            String card1 = arrayOfCards.get(i);
            String card2 = arrayOfCards.get(ind);
            arrayOfCards.remove(i);
            arrayOfCards.remove(ind);
            arrayOfCards.add(card2);
            arrayOfCards.add(card1);
        }
    }
    public Hand getHand(){
        Hand hand = new Hand(arrayOfCards.get(0), arrayOfCards.get(1), arrayOfCards.get(2), arrayOfCards.get(3), arrayOfCards.get(4), arrayOfCards.get(5));
        arrayOfCards.remove(0);arrayOfCards.remove(1);arrayOfCards.remove(2);arrayOfCards.remove(3);arrayOfCards.remove(4);arrayOfCards.remove(5);
        return hand;
    }
    public Hand getHand(Hand hand){
        if (arrayOfCards.size() >= 6 && hand.isEmpty()){
            return getHand();
        }
        else{
            if (hand.getCard2().equals("null") && arrayOfCards.size() >= 1){
                hand.setCard1(arrayOfCards.get(0));
                arrayOfCards.remove(0);
            }
            if (hand.getCard2().equals("null") && arrayOfCards.size() >= 1){
                hand.setCard2(arrayOfCards.get(0));
                arrayOfCards.remove(0);
            }
            if (hand.getCard3().equals("null") && arrayOfCards.size() >= 1){
                hand.setCard4(arrayOfCards.get(0));
                arrayOfCards.remove(0);
            }
            if (hand.getCard4().equals("null") && arrayOfCards.size() >= 1){
                hand.setCard4(arrayOfCards.get(0));
                arrayOfCards.remove(0);
            }
            if (hand.getCard5().equals("null") && arrayOfCards.size() >= 1){
                hand.setCard5(arrayOfCards.get(0));
                arrayOfCards.remove(0);
            }
            if (hand.getCard6().equals("null") && arrayOfCards.size() >= 1){
                hand.setCard6(arrayOfCards.get(0));
                arrayOfCards.remove(0);
            }
        }
        return hand;
    }

    public Dealer(ArrayList<String> arrayOfCards) {
        this.arrayOfCards = arrayOfCards;
    }
}
