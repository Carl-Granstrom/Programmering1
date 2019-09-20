package tyreso.gymnasium._9_kontrollstrukturer_2_iteration;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class IterationMethods {


    /**
     * for
     *
     * Must initialize it's value, declare a continuation condition and an increment(typically increment by 1)
     */
    public void simpleLoop() {
        for (int i = 1; i <=10; i++ ) {
            System.out.println("Variable i is now = " + i + ". This means that the loop has run " + i + " times.");
        }
    }


    /**
     * for
     *
     * Example 2, with different initialization and increment value.
     *
     * This loop prints the number series that results from binary exponentiation of the positive, non-zero integers
     *
     * TODO There's a bug in this loop, see if you can figure it out!
     */
    public void simpleLoop2(){
        for (int i = 2; i < 10000; i *= 2){
            int loopTimes = 1;
            System.out.println("Loop, pass number: " + loopTimes + ". The variable i is now: " + i);
            loopTimes++;
        }
    }


    /**
     * while
     *
     * Checks condition, and will not execute the code at all if condition is not met. Repeats the code block
     * until the condition is no longer met.
     *
     * TODO Test changing the grade to be 100 or more from the start. What happens?
     */
    public void whileLoop(){
        int myGrade = 75;
        while (myGrade < 100) {
            System.out.println("Grade too shitty, bumping grade from " + myGrade);
            myGrade++;
            System.out.println("Grade bumped to " + myGrade);
        }
        System.out.println("Grade is " + myGrade + "and is now satisfactory.");
    }


    /**
     * TODO Try removing the break. What happens?
     */
    public void whileLoopAlwaysTrue(){
        while (true) {
            System.out.println("Repeat forever unless break");
            break;
        }
    }


    /**
     * do...while
     *
     * Will always execute at least once, then check the exit condition at the end.
     */
    public void doWhileLoop(){
        int count = 0;  //you have to define the counter variable outside the loop
        do {
            SecureRandom rand = new SecureRandom(); //get a new SecureRandom object to generate random numbers with
            count += rand.nextInt(7);       //add 0 to 6 to count
            if (count > 50) {count = 50;}           //if we go over 50, set count to 50
            System.out.println("Count is now " + count + " out of 50");
        } while (count < 50);
    }

    /**
     * Enhanced for loop.
     *
     * Quickly iterate over a collection of objects.
     */
    public void enhancedForLoop(){
        List<Student> students = new ArrayList<Student>();
        for (Student s : students) {s.toString();}
    }

}
