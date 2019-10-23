package tyreso.gymnasium._9_kontrollstrukturer_2_iteration._9_kontrollstrukturer_2_iteration_exercises;

import java.security.SecureRandom;

public class IterationExercises {

    public static void main(String[] args){

        /**
         * Here your job is to figure out how to accomplish these task using one of the iteration statements. You can
         * use whichever one you feel works best for you unless otherwise stated.
         *
         * Do not forget to document your code once you are done (replace instructions with your own documentation).
         */
        //TODO YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!   YOUR CODE HERE!!!

        /**
         * 1. Print all even numbers between 0 and 20(inclusive or exclusive)
         */
        for (int i = 0; i <= 10; i++) {
            System.out.println(i*2);
        }

        /**
         * 2.1 Create a Student-class with an "asleep"-status.
         * 2.2 Create a public method on the Student class to wake the student.
         * 2.3 Create a new Student-object here
         * 2.4 Create a SecureRandom
         * 2.5 Using the above object, create a while-loop which will give the Student a 1/10 chance to wake up each
         *      iteration of the loop. Exit the loop when the student is awake.
         * 2.6 Make the class testable by printing proper feedback to the user running your program.
         */

        Student student1 = new Student("William");
        Student student2 = new Student("Kristoffer", true);
        System.out.println("Student " + student1.getName() + " is awake? " + student1.isAwake());
        System.out.println("Student " + student2.getName() + " is awake? " + student2.isAwake());
        System.out.println();
        SecureRandom randomGenerator = new SecureRandom();


        while (student1.isAwake() == false) {   //exit loop if student is now awake
            int chance = randomGenerator.nextInt(10);   //generate an integer between 0 and 9
            System.out.println("Number generated was: " + chance);
            if (chance == 10) {          //if the generated integer was 0, run codeblock
                student1.wakeStudent();  //wake the student
                System.out.println("Waking student");
            }
        }

        System.out.println();
        System.out.println("Student 2 is awake? " + student2.isAwake());
        while (student2.isAwake() == false) {   //exit loop if student is now awake
            int chance = randomGenerator.nextInt(10);   //generate an integer between 0 and 9

            if (chance == 0) {          //if the generated integer was 0, run codeblock
                student2.wakeStudent();  //wake the student
                System.out.println("Waking student");
            }
        }

        //TODO CHALLENGE!!!   CHALLENGE!!!   CHALLENGE!!!   CHALLENGE!!!   CHALLENGE!!!   CHALLENGE!!!   CHALLENGE!!!
        /**
         * Use the Mage object from last class(_8_more_objects) and create two mages which will shoot fireballs at each
         * other until one of them dies. Print a "combat log" of the damage dealt and remaining health.
         */
    }
}
