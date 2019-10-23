package tyreso.gymnasium._5_operators;

public class SimpleOperators {

    public static void main(String[] args) {

        //Variabedeklaration och initialisation
        long numOne = 3;
        System.out.println("numOne = " + numOne);
        long numTwo = 4;
        System.out.println("numTwo = " + numTwo);
        long numThree = 4;
        System.out.println("numThree = " + numThree);
        long numFour = 9;
        System.out.println("numFour = " + numFour);
        System.out.println();


        // + operatören
        long addResult = numOne + numTwo;
        System.out.println("Resultatet av additionen av numOne och numTwo är: " + addResult);
        System.out.println("Resultatet borde vara 7");
        System.out.println();


        // - operatören
        long subtractResult = numOne - numTwo;
        System.out.println("Resultatet av subtraktionen av numOne och numTwo är: " + subtractResult);
        System.out.println("Resultatet borde vara -1");
        System.out.println();


        // * operatören
        long multResult = (numOne * numTwo);
        System.out.println("Resultatet av multiplikationen av numOne och numTwo är: " + multResult);
        System.out.println("Resultatet borde vara 12");
        System.out.println();


        // / operatören
        long divResult = (numTwo / numOne);
        System.out.println("Resultatet av divisionen av numOne och numTwo är: " + divResult);
        System.out.println("Resultatet borde vara 1");
        System.out.println();

        // = operatören, har ni redan sett, skippar.

        // == operatören, ANVÄND ENDAST FÖR PRIMITIVA TYPER! (Ej referenstyper)
        System.out.println("Är numOne lika med numTwo?");
        System.out.println(numOne == numTwo);   //false
        System.out.println("Är numOne lika med numOne?");
        System.out.println(numOne == numOne);   //true
        System.out.println("Är numTwo like med numThree?");
        System.out.println(numTwo == numThree); //true
        System.out.println("Bör vara: false, true, true");
        System.out.println();

        // < och > operatörerna
        System.out.println("Är numOne större än numTwo?");
        System.out.println(numOne > numTwo);    //false
        //TODO Helklass/modig elev/ofrivilligt offer
        System.out.println("Är numTwo större än numOne?");
        System.out.println(numOne < numTwo);   //TODO CODE HERE!
        System.out.println("Är numTwo större än numTwo?");
        System.out.println(numTwo >= numTwo);   //TODO CODE HERE!

    }
}
