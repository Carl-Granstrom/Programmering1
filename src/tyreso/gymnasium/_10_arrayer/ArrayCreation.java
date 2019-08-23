package tyreso.gymnasium._10_arrayer;

public class ArrayCreation {

    /**
     *      ***********************************************
     *      ******** DEKLARATION OCH INSTANTIERING ********
     *      ***********************************************
     *
     * Deklarera en array genom att använda [] efter en datatyp (antingen primitiv eller referenstyp/objekt)
     *
     *
     * Du kan sätta klamrarna antingen efter datatypen eller variabelnamnet eller båda två(men då får du en
     * tvådimensionnell array, typ som ett Excell-ark). Blanda helst inte, utan var konsekvent(konsekvent kodningsstil =
     * betygskriterie)
     *
     * För att instantiera en array (och därmed reservera minne för den) behöver JVE:n veta vilken typ av data som ska
     * lagras i arrayen och hur många som ska lagras så att JVE:n kan reservera tillräckligt med minnesutrymme. En
     * array har alltså en fast storlek.
     */
    //primitiva arrayer
    int intArray[] = new int[20];
    int[] intArray2 = new int[15];
    int[] intArray3[] = new int[5000][5000];    //Den här tvådimensionella arrayen håller alltså 5000^2 = 25000000 ints

    byte byteArray[] = new byte[3];
    short shortsArray[]= new short[4];
    boolean booleanArray[] = new boolean[100];
    long longArray[] = new long[10];
    float floatArray[] = new float[100];
    double doubleArray[] = new double[30];
    char charArray[] = new char[20];

    //Objekt-arrayer
    Monster[] monsters = new Monster[20];
    Monster monsters2[] = new Monster[100];
    Spartan[] spartanArmy = new Spartan[300];   //ÅH NEJ!!! Inte 300 Spartaner!!!

    //Instantiera både arrayen OCH värdena i den
    int[] intArray4 = new int[]{ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };  //längd 10
    static String[] names = new String[]{"Pelle", "Maja", "Konrad", "Bill", "Bull", "Måns", "Kaa", "Biffen"};


    /* *****  Metoder  ***** */

    //Denna metod returnerar sträng-arrayen "names" till den som anropar den. Observera att returtypen är "String[]" dvs
    //en array av strängar. Metoden är "static" och kräver därför inte att ArrayCreation instantieras.
    public static String[] getNames(){
        return names;
    }

    //Denna metod returnerar arrayen intArray4, som innehåller jämna tal mellan 2 och 20.
    //Denna metod kräver instantiering innan den används.
    public int[] getEvenNumbers(){
        return intArray4;
    }



}
