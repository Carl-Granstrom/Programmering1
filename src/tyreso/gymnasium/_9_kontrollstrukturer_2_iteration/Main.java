package tyreso.gymnasium._9_kontrollstrukturer_2_iteration;

public class Main {

    public static void main(String[] args){
        IterationMethods iter = new IterationMethods();

        System.out.println("Calling methods of the IterationMethods-object 'iter' from the Main-class's main()-method: ");
        System.out.println();
        System.out.println("Calling doWhileLoop()");
        iter.doWhileLoop();
        System.out.println();
        System.out.println("Calling simpleLoop2()");
        iter.simpleLoop2();
        System.out.println();
        System.out.println("Starting loop of looping method:");

        for (int i = 1; i < 10; i++){
            String numberEnding = "";
            if (i == 1){
                numberEnding = "st";
            } else if (i == 2) {
                numberEnding = "nd";
            } else if (i == 3){
                numberEnding = "rd";
            } else {
                numberEnding = "th";
            }
            //take notice of the (i + 1) part, it's there because we start i at 0, but humans don't normally start
            //counting from 0
            System.out.println("Running the .simpleLoop()-metod for the " + i + numberEnding + " time");
            iter.simpleLoop();
        }
    }
}
