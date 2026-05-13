import javax.xml.namespace.QName;

public class Player {
    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String Name;
    public Card[] hand;


    public Player(){
        cardTotal = 0;
        isBust = false;
        isHit = true;
        Name = "Me";
        hand = new Card[2];


    }
    public void printInfo(){
        System.out.println("Hello " + Name + " you have " + cardTotal + " total cards and" + hand + "cards in your hand" + " and it is " + isBust + " that you have busted");
    }
    public void hit(){

    }
    public void stand (){

    }

}
