package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

/**
 * Test-klass för Sal-klassen som testar utskrifsfunktionen.
 * Kan för närvarande ge ArrayIndexOutOfBoundsExceptions om rader/platyserPerRad ändras till för stora värden.
 */
public class SalTest {
    public static void main(String[] args){
        Sal s1 = new Sal(Aktivitet.AEROBICS ,"Himalaya", 4, 5);
        Sal s2 = new Sal(Aktivitet.YOGA ,"Yogi", 10, 12);

        char[] a = new char[] {'1', 'a'};
        char[] b = new char[] {'1', 'c'};
        char[] c = new char[] {'2', 'a'};
        char[] d = new char[] {'2', 'b'};
        char[] e = new char[] {'2', 'c'};
        char[] f = new char[] {'2', 'd'};
        char[] g = new char[] {'7', 'e'};
        char[] h = new char[] {'3', 'a'};
        char[] i = new char[] {'3', 'g'};
        char[] j = new char[] {'6', 'h'};

        Medlem m = new Medlem(true);

        s1.bokaPlats(a, m);
        s1.bokaPlats(b, m);
        s1.bokaPlats(c, m);
        s1.bokaPlats(d, m);
        s1.bokaPlats(e, m);
        s1.bokaPlats(f, m);

        s1.printSal();

        s2.bokaPlats(a, m);
        s2.bokaPlats(b, m);
        s2.bokaPlats(c, m);
        s2.bokaPlats(g, m);
        s2.bokaPlats(h, m);
        s2.bokaPlats(i, m);

        s2.printSal();
    }
}
