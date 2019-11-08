package tyreso.gymnasium.cardgame.io_examples.WakeUpGym;

/**
 * Statisk klass för att samla autentiseringsmetoder i programmet.
 * TODO Auth-metoder för medlemmar i systemet: betalande eller ej?
 */
class Auth {

    //går ej att instantiera
    private Auth(){
    }

    /**
     * precondition medlemmens int-array personNummer är 10 lång
     * TODO Skilj på 101-åringar och 1-åringar?
     */
    static boolean pnrIsLegal(Medlem medlem) {
        int[] pnr = medlem.getPersonNummer();
        int sum = 0;
        assert (pnr.length == 10);    //assert precondition is true
        //multiplicera varannan med 2 och summera, foor-loop implementation
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                int tmp = pnr[i] * 2;
                if (tmp < 10) {
                    sum += pnr[i] * 2;
                } else {             //hantera 10-18 så att tiotals-ettan endast räknas som 1 i summeringen
                    sum += 1;
                    sum += tmp % 10;
                }
            } else {
                sum += pnr[i];
            }
        }
        return (sum % 10 == 0); // return true if the sum is evenly divisible by 10
    }
}
