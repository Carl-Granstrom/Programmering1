/*************************************************************************
 *  Syfte: Klassen är till för att hantera medlemmar i WakeUp:s system. Medlemmen skapas innan autentisering av
 *  personnummer sker. Autentisering måste sedan ske innan lagring i MedlemsRegister.
 *
 *  Ej final p.g.a.
 *
 *  Programmet skrevs som en del i Systemvetenskapsutbildningen på Luleå Tekniska Högskola(LTU)
 *  inom kursen D0019N - Programutveckling med Java. Uppgift 2.
 *
 *  @author Carl Granström
 *
 *  Datum: 2018-11-10
 *
 *************************************************************************/

package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medlem {
    private int[] personNummer;  //storing as array also permits leading zeroes
    private String namn;
    private Status medlStatus;
    private Abonnemang abonnemang;

    //Konstruktor, anropar massa metoder som inte är statiska, men det "bör" inte vara ngt problem.
    Medlem(){
        //initialisera medlemsstatus till inaktiv när ny medlem skapas
        this.medlStatus = Status.INACTIVE;
        this.namn = namnInput();
        this.personNummer = getPnrInput();
        setAbonnemang();
    }

    /**
     *  Skapa färdig testmedlem för registrering som default i MedlemsRegister.
     *  Erik Ladulås är redan medlem så ska inte betala 100kr för det.
     *  @param b används bara för att undvika standard-konstruktor.
     */
    Medlem(boolean b){

        this.namn = "Erik Ladulås";                                     //Statiskt namn
        int[] TMP = {8, 3, 0, 9, 2, 9, 0, 3, 1, 3};                     //Pnr-array, garanterat felfri
        this.personNummer = TMP;                                        //Sätt pnr till ovanstående statiska array
        this.medlStatus = Status.ACTIVE;                                //Sätt status till aktiv
        this.abonnemang = new Abonnemang(16, this.medlStatus); //Nytt abonnemang, 16 månader, utan medlskap
    }

    public Status getStatus(){
        return this.medlStatus;
    }

    public Abonnemang getAbonnemang(){
        return abonnemang;
    }

    public int[] getPersonNummer(){
        return this.personNummer;
    }

    public void setAbonnemang(){
        this.abonnemang = skapaAbonnemang(this.getStatus());
    }

    private String namnInput(){
        if (this.namn == null){
            Scanner sc = new Scanner(System.in);        //ny scanner
            System.out.println("Vänligen skriv ditt namn och tryck på Enter:");
            return sc.nextLine();  //TODO ordna ngn check på namnet så det blir ok.
        } else {
            throw new IllegalStateException();
        }
    }

    //skapa nytt abonnemang
    private Abonnemang skapaAbonnemang(Status s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många månader vill du vara medlem?\nSkriv in en siffra: ");
        return new Abonnemang(sc.nextInt(), s); //skapa ett nytt abonnemang på Medlem:en
    }

    static int[] getPnrInput(){
        Scanner sc = new Scanner(System.in);
        int[] tmpPnr = new int[10];

        System.out.println("Vänligen skriv in ditt personnummer som tio siffror och tryck Enter för att logga in:");
        String tmpString = sc.nextLine();  //store input String

        char[] tmpCharArray = tmpString.toCharArray(); //convert String to charArray
        if (tmpCharArray.length != 10) { throw new InputMismatchException("Felaktig längd på personnummret!"); }
        //move the 10 first characters of the charArray to personNummer int-array.
        for (int i = 0; i < 10; i++){
            char c = tmpCharArray[i];
            int siffra = Character.getNumericValue(c);
            if (siffra > 9 || siffra < 0) {
                throw new InputMismatchException("Input contains non-numeric characters!");
            }
            tmpPnr[i] = siffra;  //för in siffran i temporär array för att matcha mot pnr i MedlemsRegister
        }
        return tmpPnr;
    }

    @Override
    public String toString() {
        //build String out of int array personNummer
        StringBuilder b = new StringBuilder();
        for (int i : personNummer){
            b.append(i);
        }
        //return namn, pnr och det datum som abonnemanget tar slut
        return ("Namn: " + namn + "\nPnr: " + b.toString() + "\n" + getAbonnemang().toString() +
                "\n" + "Abbonemanget kostar: " + getAbonnemang().getKostnad() + ":-\n");
    }
}
