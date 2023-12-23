package pokerGameTask1.utilsHands;

public class Hand {
    private String card1;
    private String card2;
    private String card3;
    private String card4;
    private String card5;
    private String card6;

    public void discardArray(){
    }

    public Hand(String card1, String card2, String card3, String card4, String card5, String card6) {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
        this.card4 = card4;
        this.card5 = card5;
        this.card6 = card6;
    }
    public boolean isEmpty(){
        if (card1.equals(card2) && card1.equals(card3) && card1.equals(card4) && card1.equals(card5) && card1.equals(card6) && card1.equals("null")){
            return true;
        }
        else{
            return false;
        }
    }
    public String getCard1() {
        return card1;
    }

    public void setCard1(String card1) {
        this.card1 = card1;
    }

    public String getCard2() {
        return card2;
    }

    public void setCard2(String card2) {
        this.card2 = card2;
    }

    public String getCard3() {
        return card3;
    }

    public void setCard3(String card3) {
        this.card3 = card3;
    }

    public String getCard4() {
        return card4;
    }

    public void setCard4(String card4) {
        this.card4 = card4;
    }

    public String getCard5() {
        return card5;
    }

    public void setCard5(String card5) {
        this.card5 = card5;
    }

    public String getCard6() {
        return card6;
    }

    public void setCard6(String card6) {
        this.card6 = card6;
    }
}
