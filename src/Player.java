import javax.xml.namespace.QName;

public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String Name;
    public Card[] hand;


    public Player(){
        cardTotal = 2;
        isBust = false;
        isHit = false;
        Name = "Me";
        hand = new Card[2];


    }
    public void printInfo(){
        System.out.println("Hello " + Name + " your total value of cards " + cardTotal +  " and it is " + isBust + " that you have busted");
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
    public void stand (){

    }

}
