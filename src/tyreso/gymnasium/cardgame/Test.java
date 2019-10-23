package tyreso.gymnasium.cardgame;

public class Test {

    public static void main(String[] args) {

        Card testCard = new Card("Hearts", 1, false);
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);

        testCard.flip();
        System.out.println("Flipping card");
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);

        System.out.println("Flipping card thrice");
        testCard.flip();
        System.out.println("After first flip");
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);
        testCard.flip();
        System.out.println("After second flip");
        System.out.println(testCard.value + testCard.suit + testCard.faceUp);
        System.out.println("After third flip");
        testCard.flip();

        //testing turnFaceUp()
        System.out.println(testCard.turnFaceUp());
        System.out.println(testCard.turnFaceUp());


        //testing turnFaceDown()
        System.out.println(testCard.turnFaceDown());
        System.out.println(testCard.turnFaceDown());
    }




}
