package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Förutsätter jämnt antal platser per rad, är en acceptabel lösning i nuläget.
 *
 * Hade ursprungligen Sal som final pga PoLP, men det kan ju tänkas att man vill använda arv för olika typer
 * av salar om man utökar verksamheten.
 *
 * TODO Behöver printmetod för att skriva ut namnet på alla platser som inte är bokade.
 * TODO Implementera metod för bokning. Uppdatera boolean-array.
 */

public class Sal {
    private Aktivitet aktivitet;
    private ArrayList<Medlem> harBokat = new ArrayList<Medlem>();
    private String namn;
    private int rader;
    private int platserPerRad;
    //Använder inte ArrayList då jag inte vill att platserna ska flyttas runt i arrayen med några list-metoder.
    private Plats[] platser; //skapa array med antal platser (null init)
    private boolean[] bokadPlats; //detta är en "ok" lösning (false init)
    char[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};
    /**
     * @param namn          salens namn
     * @param rader         antal rader i salen
     * @param platserPerRad antal platser per rad
     */
    Sal(Aktivitet aktivitet, String namn, int rader, int platserPerRad) {
        this.aktivitet = aktivitet;
        this.namn = namn;
        this.rader = rader;
        this.platserPerRad = platserPerRad;
        this.platser = new Plats[rader * platserPerRad];
        this.bokadPlats = new boolean[rader * platserPerRad];
        //fyll platser-array med Plats-objekt med rätt namn(1a, 1b, 1c, 2a, 2b, 2c osv...)
        for (int i = 0; i < platser.length; i++){
            int rad = (i / platserPerRad) + 1;
            int alfabetsIndex = i % platserPerRad;
            char plats = alfabet[alfabetsIndex];
            platser[i] = new Plats(rad, plats);
        }
    }

    @Override
    public String toString() {
        return namn;
    }

    public void setAktivitet(Aktivitet aktivitet){
        this.aktivitet = aktivitet;
    }

    String getNamn(){
        return this.namn;
    }

    Aktivitet getAktivitet(){
        return this.aktivitet;
    }

    private boolean isLedig(int i) {
        assert i < platser.length;      //Assert legal index into array
        return !bokadPlats[i];
    }

    //konvertera chararray på formatet {'2', 'h'} till salsindex i. Boka platsen på arrayposition "i"
    void bokaPlats(char[] plats, Medlem m) {
        int i;
        //konvertera char[2] till Plats[]-index
        int radNummer = Character.getNumericValue(plats[0]);        //siffran(rad)
        int platsNummer = new String(alfabet).indexOf(plats[1]);    //bokstaven(plats på raden)

        if (platsNummer < platserPerRad && radNummer < rader) {
            i = ((radNummer - 1) * platserPerRad) + platsNummer;
        } else {
            throw new InputMismatchException("Den platsen finns inte i denna sal!");
        }

        try {
            if (isLedig(i)) {
                bokadPlats[i] = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Denna plats finns inte i salen!");
        }
        addBokat(m);
    }

    //Skriv ut en "tvådimensionell" representation av salens platser
    void printSal(){
        //om salens bredd och djup båda är mindre än tio, använd den mer avancerade representationen för utskrift
        if ((this.rader < 10) && (this.platserPerRad < 10)) {
            printSolidLine();
            for (int i = 0; i < rader; i++) {
                printPlatsLine(i);
                printSolidLine();
            }
        //om salen är väldigt stor, använd den kompakta utskriftsmetoden
        } else
            {
            for (int i = 0; i < rader; i++) {
                printPlatsLineCompact(i);
            }
        }
    }

    //skriv ut avskiljare mellan platserna vågrätt, samt övre och under kant
    private void printSolidLine(){
        for (int i = 0; i < platserPerRad; i++) {
            System.out.print("----");
        }
        System.out.println();
    }

    /**
     * Skriv ut platsnummer för lediga platser, XX för upptagna
     * @param rad det radnummer som ska skrivas ut.
     */
    private void printPlatsLine(int rad) {
        for (int i = rad * platserPerRad; i < ((rad + 1) * platserPerRad); i++) {
                System.out.print("|" + platsOrBokad(i) + "|");
        }
        System.out.println();
    }

    //Skriv ut en mer kompakt rad för större salar
    private void printPlatsLineCompact(int rad) {
        for (int i = rad * platserPerRad; i < ((rad + 1) * platserPerRad); i++) {
            System.out.printf("%-4s", platsOrBokad(i));
        }
        System.out.println();
    }

    //skriv ut Platsens namn eller, om platsen är bokad, "XX".
    private String platsOrBokad(int i) {
        if (!bokadPlats[i]) {
            return platser[i].toString();
        } else {
            return "XX";
        }
    }

    private void addBokat(Medlem medlem){
        harBokat.add(medlem);
    }

    boolean redanBokat(Medlem user) {
        for (Medlem m : harBokat) {
            if (m == user){
                return true;
            }
        }
        return false;
    }

    /**
     * Inre klass, pga composition-struktur.
     */
    private final class Plats {
        private int rad;
        private char plats;

        //Konstruktor, parametrarna kommer från Sal-konstruktorns loop
        Plats(int rad, char plats) {
            this.rad = rad;
            this.plats = plats;
        }

        @Override
        public String toString() {
            return Integer.toString(rad) + plats;
        }
    }
}
