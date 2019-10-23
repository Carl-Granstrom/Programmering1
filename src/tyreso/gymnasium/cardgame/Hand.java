package tyreso.gymnasium.cardgame;

import java.util.ArrayList;

public class Hand {
    int currentNumCards;
    int maxCards;
    ArrayList<Card> cards;

    Hand(){
        this.currentNumCards = 0;
        this.maxCards = 10000;
        this.cards = new ArrayList<Card>();
    }

    Hand(int maxCards){
        this.currentNumCards = 0;
        this.maxCards = maxCards;
        this.cards = new ArrayList<Card>();
    }

    Hand(String gameName){
        this.currentNumCards = 0;
        this.cards = new ArrayList<Card>();
        if (gameName.equals("GoFish")) {
            this.maxCards = 999;
        } else if (gameName.equals("BlackJack")){
            this.maxCards = 2;
        } else {
            this.maxCards = 10000;
        }
    }

    public void drawCard(Card card){
        cards.add(card);
    }


}
