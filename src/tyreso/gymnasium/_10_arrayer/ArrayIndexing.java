package tyreso.gymnasium._10_arrayer;

import java.util.Random;

public class ArrayIndexing {



    public static void main(String args[]){
        //instantiera ArrayCreation och lagra objektet i variabeln ac
        ArrayCreation ac = new ArrayCreation();

        System.out.println(ac.getEvenNumbers()[0]);
        System.out.println(ac.getEvenNumbers()[1]);
        System.out.println(ac.getEvenNumbers()[2]);
        System.out.println(ac.getEvenNumbers()[3]);
        System.out.println(ac.getEvenNumbers()[4]);
        System.out.println(ac.getEvenNumbers()[5]);
        System.out.println(ac.getEvenNumbers()[6]);
        System.out.println(ac.getEvenNumbers()[7]);
        System.out.println(ac.getEvenNumbers()[8]);
        System.out.println(ac.getEvenNumbers()[9]);

        //Ta bort "//" och se vad som händer.
        // System.out.println(ac.getEvenNumbers()[10]);

        //Eftersom denna metod är statisk behöver vi inte använda oss av ett objekt, utan kan anropa klassen direkt
        //(observera stor bokstav: ArrayCreation)
        System.out.println(ArrayCreation.getNames()[0]);
        System.out.println(ArrayCreation.getNames()[1]);
        System.out.println(ArrayCreation.getNames()[2]);
        System.out.println(ArrayCreation.getNames()[3]);
        System.out.println(ArrayCreation.getNames()[4]);
        System.out.println(ArrayCreation.getNames()[5]);
        System.out.println(ArrayCreation.getNames()[6]);
        System.out.println(ArrayCreation.getNames()[7]);

        //Vi kan också indexera med hjälp av en integer vi har lagrat i en variabel, eller genom att anropa Random
        int indexInt = 4;
        System.out.println("Med en variabel som håller indexsiffra:");
        System.out.println(ac.getEvenNumbers()[indexInt]);
        System.out.println(ArrayCreation.getNames()[indexInt] + "\n");
        System.out.println();

        Random random = new Random();
        System.out.println("Med slumpade tal som index:");
        System.out.println(ac.getEvenNumbers()[random.nextInt(10)]);
        System.out.println(ArrayCreation.getNames()[random.nextInt(8)]);
        System.out.println(ArrayCreation.getNames()[random.nextInt(8)]);
        System.out.println(ArrayCreation.getNames()[random.nextInt(8)]);
        System.out.println(ArrayCreation.getNames()[random.nextInt(8)]);
        System.out.println(ArrayCreation.getNames()[random.nextInt(8)]);
    }




}
