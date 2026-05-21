
public class Card {
    public String suit;
    public int value;
    public String name;


    public Card(int pvalue, int psuit, int pname ) {
        value= pvalue;
       // suit = psuit;
        if (psuit ==0){
            suit="Hearts";
        }
        else if (psuit ==1){
            suit="Diamonds";
        }
        else if (psuit ==2){
            suit="Spades";
        }
        else if (psuit ==3){
            suit="Clubs";
        }
        if (pname ==0 ){
            name = "Ace";
            value = 11;
        }
        else if(pname == 1){
            name = "2";
            value= 2;
        }
        else if(pname == 2){
            name = "3";
            value= 3;
        }
        else if(pname == 3){
            name = "4";
            value= 4;
        }
        else if(pname == 4){
            name = "5";
            value= 5;
        }
        else if(pname == 5){
            name = "6";
            value= 6;
        }
        else if(pname == 6){
            name = "7";
            value= 7;
        }
        else if(pname == 7){
            name = "8";
            value= 8;
        }
        else if(pname == 8){
            name = "9";
            value= 9;
        }
        else if(pname == 9){
            name = "10";
            value= 10;
        }
        else if(pname == 10){
            name = "Jack";
            value= 10;
        }
        else if(pname == 11){
            name = "Queen";
            value= 10;
        }
        else if(pname == 12){
            name = "King";
            value= 10;
        }
       // name = pname;
    }

   public void printInfo(){
        System.out.println("the " + name + " of " + suit + " is worth " + value + " points.");

    }

}