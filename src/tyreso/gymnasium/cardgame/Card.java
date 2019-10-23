package tyreso.gymnasium.cardgame;

public class Card {

    String suit;
    int value;
    boolean faceUp;

    public Card(String suit, int value, boolean faceUp){
        this.suit = suit;
        this.value = value;
        this.faceUp = faceUp;

    }
    // Methods
    public void flip(){
        if (faceUp){
            faceUp = false;
        } else if (!faceUp) {
            faceUp = true;
        }

    }

    //Turns the card face up if it's facing down, otherwise do nothing
    public String turnFaceUp(){
        String returnString = "";
        if (faceUp){
            returnString = "Card is already face up!";
        } else if (!faceUp) {
            this.flip();
            returnString = "Card was flipped face up!";
        }


        return returnString;
    }

    //Turns the card face down if it's facing up, otherwise do nothing
    public String turnFaceDown(){
        String returnString = "";
        if (faceUp){
            returnString = "Card was flipped face down!";
            this.flip();
        } else if (!faceUp) {
            returnString = "Card is already face down!";
        }
        return returnString;
    }

    @Override
    public String toString(){
        return this.value + " " + this.suit;
    }
}
