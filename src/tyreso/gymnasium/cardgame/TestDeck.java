package tyreso.gymnasium.cardgame;

public class TestDeck {
    public static void main(String[] args){
        Deck testDeck = new Deck();

        for (Card card : testDeck.deck) {
            System.out.println(card.value + " " + card.suit);
        }
        System.out.println();
        System.out.println();
        System.out.println("Shuffling deck...");
        testDeck.shuffle();
        System.out.println("printing shuffled deck");
        for (Card card : testDeck.deck) {
            System.out.println(card.value + " " + card.suit);
        }

        System.out.println();
        System.out.println("Printing deck.toString BEFORE dealing cards");
        System.out.println(testDeck);
        System.out.println();

        System.out.println();
        System.out.println("Dealing five cards from the top...");
        System.out.println(testDeck.dealTopCard());
        System.out.println(testDeck.dealTopCard());
        System.out.println(testDeck.dealTopCard());
        System.out.println(testDeck.dealTopCard());
        System.out.println(testDeck.dealTopCard());

        System.out.println();
        System.out.println("Printing deck.toString AFTER dealing cards");
        System.out.println(testDeck);
        System.out.println();

        testDeck.shuffle();
        System.out.println();
        System.out.println("Shuffling deck with five less cards");
        for (Card card : testDeck.deck) {
            if (card != null){
                System.out.println(card.value + " " + card.suit);
            } else {
                System.out.println("<null>");
            }

        }
    }
}
