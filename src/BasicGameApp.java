import javax.naming.Name;
import java.util.Scanner;

public class BasicGameApp {
    public Card[] deck;
    public Player me;
    public Dealer d;
    public int bet;

    public static void main(String[] args) {
        new BasicGameApp();

    }

    public BasicGameApp() {
        System.out.println("Welcome to Blackjack");
        deck = new Card[52];
        int counter = 0;
        for (int y = 0; y < 4; y++) {//4 suits per deck
            for (int x = 0; x < 13; x++) { //13 cards per suit
                deck[counter] = new Card(10, y, x);
                counter++;
            }

        }



        Scanner s = new Scanner(System.in);
        System.out.println("what is your name");
        String name = s.nextLine();
        me = new Player();
        d = new Dealer();
        boolean playing = true;
        while (playing) {
            me.hand = new Card[10];
            d.hand = new Card[10];

            me.cardsInHand = 2;
            d.cardsInHand = 2;

            me.cardTotal = 0;
            d.cardTotal = 0;

            me.isBust = false;
            d.isBust = false;
            shuffle();
            int deckPosition = 6;
            printDeck();
            me.hand[0] = deck[0];
            me.hand[1] = deck[1];
            me.calculateTotal();

            d.hand[0] = deck[2];
            d.hand[1] = deck[3];
            d.calculateTotal();

            System.out.println("You currently have $" + me.money);
            if (me.money <= 0){
                System.out.println("YOU ARE OUT OF MONEY");
                playing=false;
            }

                System.out.println("How much would you like to bet?");
                bet = Integer.parseInt(s.nextLine());
                while (bet > me.money || bet <= 0) {
                    System.out.println("INVALID BET");
                    System.out.println("You currently have " + me.money + " Dollars");
                    System.out.println("How much would you like to bet?");
                    bet = Integer.parseInt(s.nextLine());
                }
            if (me.cardTotal == 21){
                System.out.println("BLACKJACK! YOU WIN");
                me.money += bet;
            }

            me.Name = name;
            me.printInfo();
            d.printFirstCard();

            while (me.isBust == false) {
                System.out.println("Do you want to hit yes or no");
                String choice = s.nextLine();
                if (choice.equals("yes")) {
                    me.hand[me.cardsInHand] = deck[deckPosition++];
                    me.cardsInHand++;
                    me.calculateTotal();
                    me.printInfo();
                }
                if (choice.equals("no")) {
                    break;
                }
                if (me.cardTotal > 21) {
                    me.isBust = true;
                    System.out.println("YOU BUSTED");
                }
            }


            if (d.cardTotal < 17) {
                System.out.println("Dealer reveals hidden card");
                d.printInfo();
            }

            if (me.cardTotal > 21) {
                me.isBust = true;
                System.out.println("YOU BUSTED");
            }
            while (d.cardTotal < 17) {
                d.hand[d.cardsInHand] = deck[deckPosition++];
                d.cardsInHand++;

                d.calculateTotal();

                System.out.println("Dealer hits");
                d.printInfo();
            }
            if (d.cardTotal >= 17) {
                System.out.println("Dealer stands with " + d.cardTotal);
            }
            if (me.cardTotal > 21) {
                me.isBust = true;
                System.out.println("YOU BUSTED");
            }
            if (d.cardTotal > 21) {
                d.isBust = true;
                System.out.println("DEALER BUSTED");
            }
            if (me.isBust && !d.isBust) {
                System.out.println("DEALER WINS");
                me.money -=bet;

            } else if (d.isBust && !me.isBust) {
                System.out.println("YOU WIN");
                me.money +=bet;
            } else if (d.isBust && me.isBust) {
                System.out.println("BOTH BUSTED, PUSH");
            } else {
                if (me.cardTotal > d.cardTotal) {
                    System.out.println("YOU WIN");
                    me.money +=bet;

                } else if (d.cardTotal > me.cardTotal) {
                    System.out.println("DEALER WINS");
                    me.money -=bet;

                } else {
                    System.out.println("PUSH");

                }


            }
            System.out.println("Play again? yes or no");
            String again = s.nextLine();

            if (again.equals("no")){
                playing = false;
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
