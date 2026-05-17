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
                //deck[x].printInfo();
            }
        }
        shuffle();
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
        System.out.println(name);
        me.Name= name;
        me.printInfo();
        d.printInfo();

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
            deck[x].printInfo();
        }


    }
}
