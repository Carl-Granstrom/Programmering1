package tyreso.gymnasium._7_kontrollstrukturer_1_sekvens_selektion;

/**
 * Class demonstrating Java control structures sequence and selection for the course Programmering 1.
 *
 * @author Carl Granström
 */
public class SekvensSelektion {

    public static void main(String[] args){

        //Deklarera variabler
        int a;

        //Kör metod. Sekvens (detta är ingen klass, endast en metod i en "dummy-klass")
        a = 3;
        a += 5;

        System.out.println(a);
        if (a >= 8) {
            System.out.println("Min brax tror den är en tax");
        } else {
            System.out.println("Du är en lax");
        }

        //TODO Använd decrement operator för att minska variabeln a med 1
        System.out.println(a);

        if (a < 8 ) {
            System.out.println("Du är en lax");
        } else {
            System.out.println("Min brax tror den är en tax");
        }

        //TODO Ta a gånger 2
        System.out.println(a);

        if (!(a < 8)) {
            System.out.println("Min brax tror den är en tax");
        } else {
            System.out.println("Du är en lax");
        }
    }
}
