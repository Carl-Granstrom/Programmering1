package tyreso.gymnasium.cardgame;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Hand {
    int maxCards;
    ArrayList<Card> cards;

    Hand(){
        this.maxCards = 10000;
        this.cards = new ArrayList<Card>();
    }

    Hand(int maxCards){
        this.maxCards = maxCards;
        this.cards = new ArrayList<Card>();
    }

    Hand(String gameName){
        this.cards = new ArrayList<Card>();
        if (gameName.equals("GoFish")) {
            this.maxCards = 999;
        } else if (gameName.equals("BlackJack")){
            this.maxCards = 2;
        } else {
            this.maxCards = 10000;
        }
    }

    public void takeCard(Card card){
        cards.add(card);
    }

    public Card removeCard(int indexPosition){
        Card tmp = cards.get(indexPosition);
        cards.remove(indexPosition);
        return tmp;
    }

    public Card removeCard(Card card) {
        if (cards.contains(card)) {
            int index = cards.indexOf(card);
            return removeCard(index);
        }
        return null;
    }

    public Card removeRandomCard() {
        SecureRandom r = new SecureRandom();
        int randomNumber = r.nextInt(cards.size());
        return removeCard(randomNumber);
    }


}
