package tyreso.gymnasium._7_kontrollstrukturer_1_sekvens_selektion._7_kontrollstrukturer_1_sekvens_selektion_exercises;

import java.security.SecureRandom;

/**
 * This class outlines, in pseudocode, the steps to be taken to practice writing selection-statements using different
 * operators and datatypes for the course Programmering 1.
 *
 * You might have to consult the presentation on operators.
 */
public class SelectionWithOperatorsAndDataTypes {

    public static void main(String[] args) {
        //Declare variables
        int a;
        int b;
        int c;
        double x;
        double y;
        double z;

        //TODO YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!

        //TODO nr1
        //Assign a the value 7
        //Assign x the value 7.00000001
        //Compare a and x to check whether a is larger than x
        //Check whether a is the same size as x
        //Check whether a is smaller than x
        //For each step above, print some relevant text to console


        //TODO nr2
        //Change a to be 5
        //Assign 3 to b
        //Assign 5.0000 to y
        //If a is smaller than b or equal to y, print something relevant to console
        //TODO Challenge: do it with only one if-clause

        //TODO nr3
        //Fix the bug in this reworked version of the if/else mathClass code from PowerPoint 7
        SecureRandom random = new SecureRandom();
        int classSize = random.nextInt(33); //assigns an integer between 0 and 32
        System.out.println("Size of the class is: " + classSize);
        if (classSize < 6) {
            System.out.println("Class is to small, canceling");
        }
        //TODO Use Visual Paradigm to draw a diagram of the code you wrote(this is actually backwards, you usually draw the
        // diagrams first and then build the code based on the diagram, but whatever.

        //TODO !!!CHALLENGE!!!   !!!CHALLENGE!!!   !!!CHALLENGE!!!   !!!CHALLENGE!!!   !!!CHALLENGE!!!
        //Do something fun with the switch statement

    }
}
