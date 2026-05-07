
public class Card {
    public String suit;
    public int value;
    public String name;


    public Card(int pvalue, String psuit, int pname ) {
        value= pvalue;
        suit = psuit;
        if (pname ==0 ){
            name = "Ace";
            value = 11;
        }
        else if(pname == 1){
            name = "2";
            value= 2;
        }
       // name = pname;
    }

    public void printInfo(){
        System.out.println("the " + name + " of " + suit + " is worth " + value + " points.");

    }

}