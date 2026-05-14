public class Dealer {
    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;

    public Dealer() {
        isOver15=false;
        cardTotal=0;
        isBust=false;
        hand = new Card[2];
    }

    public void printInfo(){
        System.out.println("The dealers card value is " + cardTotal +   " and it is " + isBust + " that they have busted" + " and it is " + isOver15 + " that they are over 15");
        for (int s=0; s<hand.length; s++){
            hand[s].printInfo();
        }
    }
    public void calculateTotal(){
        cardTotal=0;
        for (int f=0; f<hand.length; f++){
            cardTotal += hand[f].value;
        }

    }


    public void hit(){
    }

    public void stand(){
    }

}
