package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

import java.util.ArrayList;

final class MedlemsRegister {
    private static MedlemsRegister singleRegister = new MedlemsRegister();
    ArrayList<Medlem> medlemsRegister = new ArrayList<Medlem>();

    static MedlemsRegister getInstance() {
        return singleRegister;
    }

    /**
     * Skapar statisk medlem "Magnus Ladulås" med pnr: 8309290313 och försöker lägga till i registret.
     * Statisk medlem behövs för snabba test av login-funktion och bokningar.
     */
    private MedlemsRegister(){
        addMedlem(new Medlem(true));
    }

    //Lägg till en medlem i registret.
    void addMedlem(Medlem medlem){
        if (Auth.pnrIsLegal(medlem)){
            medlemsRegister.add(medlem);
        }
        else {
            throw new IllegalStateException("Medlemmen har felaktigt personnummer!");
        }
    }

    /**
     * TODO Convenience methods: Undo-ta bort senast tillagda medlem, Remove[i]-ta bort Medlem at index i osv
     * TODO Egentligen kan man köra en implements List<E>. Ska se om jag orkar.
     */

}
