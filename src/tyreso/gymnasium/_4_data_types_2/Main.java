package tyreso.gymnasium._4_data_types_2;

public class Main {

    public static void main(String[] args){

        //Create a new engine
        Engine engine = new Engine();

        //Nah, I need 6 cylinders... or whatever is cool... I should leave the Car examples to Pålle
        Engine engine2 = new Engine(6);

        //Now I can use the Engine-object and "place it into" a new Car-object
        Car myNewCar = new Car("Carl's New Car", 4, 5, 345,
                174, engine2);

        //Now what will my new Car object print when I call it's .toString()-method?
        System.out.println(myNewCar.toString());
    }

}
