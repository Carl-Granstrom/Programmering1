package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

import java.time.LocalDate;

public class Abonnemang {
    private LocalDate startDatum;
    private LocalDate slutDatum;
    private int manader;
    private int kostnad;
    private Status medlem;

    //beräkna kostnaden för abonnemanget utifrån om personen redan är medlem eller ej samt antal månader.
    Abonnemang(int manader, Status medlem) {
        this.startDatum = LocalDate.now();
        this.slutDatum = startDatum.plusMonths(manader);
        this.manader = manader;
        this.kostnad = beraknaKostnad(manader, medlem);
        this.medlem = medlem;
    }

    /*
    * Ersätt bool param med metodanr. till metod isMedlem(); lagra isMedlem(bool) i Medlem?
    */
    private int beraknaKostnad(int manader, Status s){
        int totalKostnad;  //placeholder
        final int basPris = 250;
        final int extra = 50;

        //Kontrollera att param månader är ett lagligt värde, glöm ej excep-handling längre "upp" i programmet.
        if (manader <= 0) {
            throw new IllegalArgumentException("Antal månader måste vara ett positivt heltal!");
        }

        //Stör mig på att intervallet 1-2 månader inte är en multiplier av 3, då hade den här koden kunnat vara vackrare
        if (manader > 12) {
            totalKostnad = manader * basPris;
        }
        else if (manader > 6) {
            totalKostnad = (manader * basPris) + (manader * extra);
        }
        else if (manader > 2) {
            totalKostnad = (manader * basPris) + (manader * extra * 2);
        }
        else {
            totalKostnad = (manader* basPris) + (manader * extra * 3);
        }
        /*Oklart hur detta ska hanteras längre upp i programmet, men denna uträkning måste ske innan medlemskapet
        registreras på personen. */
        if (s == Status.INACTIVE) {
            totalKostnad += 100;
        }

        return totalKostnad;
    }

    int getKostnad(){
        return kostnad;
    }

    int getManader(){
        return this.manader;
    }

    public LocalDate getSlutDatum(){
        return slutDatum;
    }

    @Override
    public String toString(){
        return "Abonnemanget slutar: " + slutDatum.toString();
    }
}
