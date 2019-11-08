package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

import java.util.Calendar;

/**
 * OBS!!! Används ej för närvarande!!!
 *
 * Schema för en dag som tillåter att salar som ska användas för en viss aktivitet registreras på dagen.
 *
 * TODO Antagande: endast förmiddags- och eftermiddagspass pga för lat för att hantera tidsbokning.
 *
 * TODO Enda dagen som går att boka är 2018-12-24, pga orka.
 */
public class DagsSchema {
    private Calendar datum;             //dagens datum
    private String dag;
    private Sal[] formiddag;        //array med salar för förmiddagspass
    private Sal[] eftermiddag;      //array med salar för eftermiddagspass

    private DagsSchema(Dag dag, Sal[] formiddag, Sal[] eftermiddag) {
        datum.set(2018, 12, 24);            //skapa julaftonsbokning
        //konvertera enum till String med initial versal och resten gemener.
        String tmp = dag.toString();
        this.dag = tmp.substring(0, 0) + tmp.substring(1).toLowerCase();
        this.formiddag = formiddag;
        this.eftermiddag = eftermiddag;
    }


}
