public class Dealer {
    public boolean isOver15;
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;
    public int cardsInHand;

    public Dealer() {
        isOver15=false;
        cardTotal=0;
        isBust=false;
        hand = new Card[10];
        cardsInHand=2;
    }

    public void printInfo(){
        System.out.println("The dealers card value is " + cardTotal +   " and it is " + isBust + " that they have busted" + " and it is " + isOver15 + " that they are over 15");
        for (int s=0; s<cardsInHand; s++){
            hand[s].printInfo();
        }
    }
    public void printFirstCard(){
        System.out.println("Dealer is Showing");
        hand[0].printInfo();
        System.out.println("Second Card is Hidden");
    }
    public void calculateTotal(){
        cardTotal = 0;
        int aceCount = 0;

        for (int f = 0; f < cardsInHand; f++){

            cardTotal += hand[f].value;

            if (hand[f].value == 11){
                aceCount++;
            }
        }

        while (cardTotal > 21 && aceCount > 0){
            cardTotal -= 10;
            aceCount--;
        }


    }


    public void hit(){
    }

    public void stand(){
    }

}
