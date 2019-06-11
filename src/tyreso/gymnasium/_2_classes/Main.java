package tyreso.gymnasium._2_classes;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Hello Car");
        System.out.println();

        //Create a new variable of type Car, then create a new Car-object and "store" it in the variable
        Car carOne = new Car();
        //Instantiate(create) a second Car object using the same method
        Car carTwo = new Car();

        //Check if carOne is the same object as carTwo and print the result
        System.out.println(carOne.equals(carTwo));

        //Perform a similar check again using different syntax.
        //There are subtle differences here which I will not dig to deep into.
        //Google "equals method versus equals operator" to learn more.
        System.out.println(carOne == carTwo);

        //Blank line
        System.out.println();

        //Test some carOne methods
        System.out.println("drive() method of carOne:");
        carOne.drive();     //How come this method call prints "Wroooom!" to console?
                            //It doesn't use System.out.println()!?
        System.out.println();

        //call the drive()-method of carOne and carTwo using a returned String instead
        System.out.println("printing drive-Strings of carOne and carTwo using return value");
        System.out.println(carOne.driveReturnsString()); // <--method returns a String that is then passed to System.out
        System.out.println(carTwo.driveReturnsString());
        System.out.println();

        //print the brand of carOne directly accessing its variable(this is BAD IDEA (tm))
        System.out.println("Printing brand of carOne:");
        System.out.println(carOne.brand);
        System.out.println();

        //change the brand of carOne
        System.out.println("--Changing brand of carOne--");
        carOne.rebrand("Saab");
        System.out.println();

        //print brand of carOne again
        System.out.println("Printing brand of carOne after rebranding:");
        System.out.println(carOne.brand);
        System.out.println();



    }

}
