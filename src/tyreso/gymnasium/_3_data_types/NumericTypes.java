package tyreso.gymnasium._3_data_types;

/**
 * Class used to demonstrate the numeric primitive types in Java.
 */
public class NumericTypes {

    /**
     * Dessa olika typer används för att lagra positiva och negativa numeriska heltal och är olika stora.
     * Om den primitiva datatypen är för liten för att lagra talet blir det KAOS ME HAN! Akta! Detta kallas
     * overflow.
     *
     * P.g.a. risken för overflow föredras ofta datatypen long om applikationen inte har specifika prestandakrav
     *
     * byte är 8bits / 1 byte (Duh!)
     * short är 16bits / 2 byte
     * int är 32bits / 4 byte
     * long är 64bits / 8 byte
     */
    byte miniHeltal = -4;           //Heltal mellan -127 och 128
    short smaHeltal = 3_489;        //Små heltal
    int heltal = -72_138_124;       //Positiva och negativa heltal, till exempel 0, 1, 67, 731937194 och -24, -90191
    long storaHeltal = 854_775_808_000L;
                                    //"L" visar kompilatorn att du vill ha en 64-bitars(long) representation
                                    //Stora positiva och negativa heltal, nämligen:
                                    // -9,223,372,036,854,775,808 till 9,223,372,036,854,775,807

    /**
     * Dessa datatyper används för att representera decimaltal, och kallas för flyttal(flyt-tal) eller floats.
     * Detta eftersom platsen för decimaltecknet kan "vandra"/"flyta" i talet.
     * Både 1,289 (ett komma tvåhundraåttionio) och 128,9 (hundratjugoåtta komma nio) kan representaras med samma
     * utrymme.
     */
    float kortDecimalTal = 1.456F;      //"F" ser till att siffran på höger tolkas som en float istället för en double.
    double langtDecimalTal = 11232.124; //Längre decimaltal representeras av double, double är standarden i praktiken.
                                        //Tänk på att längre inte betyder "större", bara "fler siffror"
}
