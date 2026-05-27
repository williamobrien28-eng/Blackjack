import javax.naming.Name;
import java.util.Scanner;

public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer d;

    public static void main(String[] args) {
        new BasicGameApp();
    }

    public BasicGameApp() {
        System.out.println("Welcome to Blackjack");
        deck = new Card[52];
        int counter =0;
        for (int y = 0; y < 4; y++) {//4 suits per deck
            for (int x = 0; x < 13; x++) { //13 cards per suit
                deck[counter] = new Card(10, y, x);
                counter++;
            }

        }
        shuffle();
        int deckPosition = 6;
        printDeck();
        me = new Player();
        d = new Dealer();
        me.hand[0] = deck[0];
        me.hand[1] = deck [1];
        me.calculateTotal();
        d.hand[0] = deck[2];
        d.hand[1] = deck[3];
        d.calculateTotal();


        Scanner s = new Scanner(System.in);

        System.out.println("what is your name");
        String name = s.nextLine();
        me.Name= name;
        me.printInfo();
        d.printFirstCard();
        while (me.isBust == false){
        System.out.println("Do you want to hit yes or no");
        String choice = s.nextLine();
      if (choice.equals("yes")){
          me.cardsInHand++;
          me.calculateTotal();
          me.printInfo();
      }
            if (choice.equals("no")){
                break;
            }
      if (me.cardTotal >21) {
          me.isBust = true;
          System.out.println("YOU BUSTED");
      }
      }


      if (d.cardTotal >16){
          System.out.println("Dealer reveals hidden card");
          d.printInfo();
      }

        if (me.cardTotal >21){
            me.isBust = true;
            System.out.println("YOU BUSTED");
        }
        if (d.cardTotal <16){
            d.hand[d.cardsInHand] = deck [4];
            d.cardsInHand++;
            d.calculateTotal();
            System.out.println("Dealer Hits");
            d.printInfo();
        }
        if (d.cardTotal <16){
            d.hand[d.cardsInHand] = deck [5];
            d.cardsInHand++;
            d.calculateTotal();
            System.out.println("Dealer Hits");
            d.printInfo();
        }
       if (me.cardTotal > 21){
           me.isBust=true;
           System.out.println("YOU BUSTED");
       }
        if (d.cardTotal > 21){
            d.isBust=true;
            System.out.println("DEALER BUSTED");
        }
        if (me.isBust && !d.isBust){
            System.out.println("DEALER WINS");
        }
        else if (d.isBust && !me.isBust){
            System.out.println("YOU WINS");
        }
        else if (d.isBust && me.isBust){
            System.out.println("BOTH BUSTED, PUSH");
        }
        else {
            if (me.cardTotal > d.cardTotal){
                System.out.println("YOU WIN");
            }
            else if (d.cardTotal > me.cardTotal){
                System.out.println("DEALER WINS");
            }
        else {
                System.out.println("PUSH");
            }

        }

        }


    public void compare() {

    }

    public void round() {

    }

    public void shuffle() {
    for (int l=0; l<deck.length; l++){
        int randomIndex = (int)(Math.random() *52);
        Card spencer = deck[randomIndex];
         deck[randomIndex] = deck[l];
         deck[l]=spencer;

    }

    }

    public void printDeck() {
        for (int x = 0; x < deck.length; x++) {

        }


    }
}
