package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

import java.util.ArrayList;

/**
 * Testar Singleton-pattern
 */
final class SalsRegister {
    private static SalsRegister singleRegister = new SalsRegister();

    private ArrayList<Sal> register = new ArrayList<>();

    static SalsRegister getInstance() {
        return singleRegister;
    }

    /**
     * Skapar i nuläget några salar statiskt som en placeholder för test.
     */
    private SalsRegister() {
        register.add(new Sal(Aktivitet.YOGA ,"Lotusblomman",3,3));          //ph, move to method
        register.add(new Sal(Aktivitet.SPINNING ,"Racecourse", 6, 12));     //ph
        register.add(new Sal(Aktivitet.AEROBICS ,"Lilla Nirvana", 4, 6));   //ph
    }

    /**
     * Hämta första salen i register som erbjuder aktiviteten a
     * TODO Eventuellt returnera flera salar eller den första salen med tomma platser?
     * @param a den typ av aktivitet som Medlem user försöker boka från WakeUpFacade.bokaPlats(Medlem m)
     * @return Den sal som har aktiviteten. Inga Salar returnerar null.
     */
    Sal getAktivitetsSal(Aktivitet a){
        for (Sal s : register){
            if (s.getAktivitet() == a){
                return s;
            }
        }
        return null;
    }
}
