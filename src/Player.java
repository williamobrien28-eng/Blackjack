import javax.xml.namespace.QName;

public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String Name;
    public Card[] hand;
    public int cardsInHand;


    public Player(){
        cardTotal = 2;
        isBust = false;
        isHit = false;
        Name = "Me";
        hand = new Card[10];
        cardsInHand=2;


    }
    public void printInfo(){
        System.out.println("Hello " + Name + " your total value of cards " + cardTotal +  " and it is " + isBust + " that you have busted");
        for (int s=0; s<cardsInHand; s++){
            hand[s].printInfo();
        }
    }

    public void calculateTotal(){
        cardTotal=0;
        int aceCount = 0;

        for (int f=0; f<cardsInHand; f++){
            if (hand[f].value == 11){
                aceCount ++;
            }


        }
        while (cardTotal > 21 && aceCount > 0){
            cardTotal -= 10;
            aceCount--;
        }

    }



    public void hit(){

    }
    public void stand (){

    }

}
