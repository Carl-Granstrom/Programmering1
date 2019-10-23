package tyreso.gymnasium._10_arrayer;

public class ArrayIteration {

    public static void main(String args[]){

        ArrayCreation ac = new ArrayCreation();     //instantiera ett Objekt av Klassen ArrayCreation
        int[] evenNumbers = ac.getEvenNumbers();    //skapa en pointer till det nya objektets nummerarray
                                                    //OBS! Detta är INTE en kopia, utan en pointer till SAMMA array

        //Vanligt for-statement för att iterera över en array
        //observera hur vi kan få loopen att fungera oavsett hur lång arrayen är utan att få idex-out-of-bounds fel
        //eftersom vi hämtar längden på arrayen via .length()-metoden och använder den i vårat stop-condition.
        for (int i = 0; i < evenNumbers.length ; i++){

            //här indexerar vi in i arrayen med hjälp av kontrollvariabeln "i" för att skriva ut den siffra som är på
            //den aktuella indexpositionen. Eftersom i ökar med 1 efter varje printstatement kommer loopen hämta alla
            //värden i arrayen.
            System.out.println(evenNumbers[i]);

        }

        //skapa en "klon", dvs kopia av arrayen med namn i ArrayCreation-klassen. Lagra den i variabeln "names"
        String[] names = ArrayCreation.getNames().clone();

        //eftersom det är VÄLDIGT vanligt att vilja iterera över alla objekt i en lista så tillhandahåller både arrayer
        //och Javas Collection-klasser(mer om detta nästa lektion, nr 11) en "enhanced iteration statement"
        for (String name : names){
            //"LÄS: för varje sträng i arrayen names, kalla den för "name" ( läs ":" som "in")
            //(så att jag kan göra ngt med den i loopens kodblock)

            //skriv ut strängen "name"
            System.out.println(name);

            //skriv ut första bokstaven i name
            System.out.println(name.charAt(0));
        }

        System.out.println("\nCreating and printing the oddNumbers array:");
        int[] oddNumbers = new int[10];
        int counter = 0;
        for (int number : evenNumbers){
            number -= 1;                    //decrement the number by 1
            System.out.println(number);     //print the number
            oddNumbers[counter] = number;   //add the number to the "oddNumbers"-array at the correct index position
            counter++;                      //increment counter (we don't usually need to have a counter in the
                                            //enhanced statement, so this is just for demonstration.
        }

        System.out.println("\nReprinting the oddNumbers array with enhanced for-statement");
        for (int i : oddNumbers){
            System.out.println(i);
        }

        //Frågan är: eftersom vi tog -1 på alla nummer i evenNumbers-arrayen, är den numera identisk med oddNumbers?
        System.out.println("\nReprinting the original evenNumbers-array");
        for (int i : evenNumbers){
            System.out.println(i);
        }
    }
}
