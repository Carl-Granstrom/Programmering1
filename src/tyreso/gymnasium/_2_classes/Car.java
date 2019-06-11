package tyreso.gymnasium._2_classes;

import java.time.LocalDate;

/**
 * This is a basic Car-class, intended to demonstrate the anatomy of a class.
 *
 * It demonstrates: class declaration, variable declaration, constructor and methods.
 *
 * @author Carl Granström
 * @since 1.0
 */
//This is the class declaration, it's used for fancy stuff we will do later in the course.
public class Car {

    //This is the variable declaration. It defines the STATE/TILLSTÅND of the object.
    //Specify the TYPE of the variable(white) first, then the name of the variable(purple).
    String name;
    String brand;
    String model;
    Color paintJobColor;
    LocalDate yearOfManufacture;

    //This is the constructor, it decides what data the declared variables should hold when a new object is created.
    //The constructor can include logic to make the objects different depending on some condition.
    //The constructor should always match the name of the class, and can have no return type(it returns a new object).
    Car() {
        this.name = "New Car";
        this.brand = "Volvo";
        this.model = "740";
        this.paintJobColor = new Color();
        this.yearOfManufacture = LocalDate.ofYearDay(1983, 1);
    }

    //This is a method, it defines the BEHAVIOUR/BETEENDE of the object.
    //Methods should follow the Single Responsibility Principle(SRP): they should do only one "thing".
    //How big the "thing" it does can be is a matter of taste and tradition.
    public void drive(){
        System.out.println("Wroooom!");
    }

    //This is another method

    //ACCESS MODIFIER
    //"public" is an "access modifier", the access modifier decides what other classes can use the method.
    //if you provide no access modifier then the methods can only be used by other classes in the same "package"(folder)
    // *no modifier*/private/public/protected
    public String driveReturnsString(){
        return "Wroooom!";
    }

    //RETURN VALUE
    //All methods have to specify what they "send back"(return) to the CALLER(the line of code which uses the method)
    //"void" has to be specified if the method should not return anything
    //If the method is to return an object, specify the object type with an initial CAPITAL letter: String, Apple, Car
    //A method can also return a primitive value(more on those later).
    //Specify the primitive value with a lower case initial letter: int, long, char, double, byte, boolean
    public String rebrand(String newBrand){
        this.brand = newBrand;
        return "Rebranding successfull";
    }

    //PARAMETERS
    //Methods may or may not require that you provide them with data.
    //Empty brackets means no input possible/required
    //input is specified as methodName(ClassType name)
    //Multiple parameters are separated by a simple comma: ,
    private void takeLotsOfParams(Color someColor, Color anotherColor, double aDouble, int anInt, String newName){

        //change the name to match the provided String called newName
        this.name = newName;

        //Create a new LOCAL VARIABLE (read about SCOPE)
        int localVariableInt;

        //change the value of localVariableInt to match the value of the parameter anInt
        localVariableInt = anInt;

        //double the value of localVariableInt
        localVariableInt = localVariableInt * 2;

        //add 5 to the value of localVariableInt
        localVariableInt = localVariableInt + 5;

        //add 5 to it again, but with different syntax (doing the same thing using other expressions)
        localVariableInt += 5;  //This is quicker but does the same thing as above

    }

    //The text below indicates you are to write code of your own here
    //TODO !!!YOUR CODE HERE!!!   !!!YOUR CODE HERE!!!   !!!YOUR CODE HERE!!!   !!!YOUR CODE HERE!!!
    /**
     * Instructions telling you what you need to do.
     */


    //The text below indicates that there's more fun and bonus points to be had from completing the challenges below
    //TODO !!!CHALLENGE!!!   !!!CHALLENGE!!!   !!!CHALLENGE!!!   !!!CHALLENGE!!!   !!!CHALLENGE!!!
    /**
     * Sometimes the challenge might just be to experiment and do something fun which we havn't covered in class.
     * Surprise us!!!
     *
     * It's also encouraged to ask for tips and further challenges!
     */
}
