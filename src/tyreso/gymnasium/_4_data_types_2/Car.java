package tyreso.gymnasium._4_data_types_2;

class Car {
    //Primitive types and Strings
    String name;
    int numDoors;
    int numSeats;
    double lenghtCentimetres;
    double heightCentimetres;

    //Reference types, aka Objects
    Long numMetersDriven;   //Wrapper type for long primitive datatype
    Door driverDoor;
    Door shotgunDoor;
    Engine engine;

    Car(String name, int numDoors, int numSeats, double lenghtCentimetres, double heightCentimetres, Engine engine ){

        //Using the passed parameters to make the object with the variable values you want
        this.name = name;
        this.numDoors = numDoors;
        this.numSeats = numSeats;
        this.lenghtCentimetres = lenghtCentimetres;
        this.heightCentimetres = heightCentimetres;
        this.engine = engine;

        //Setting standard values for these variables
        this.numMetersDriven = 0L;  //the "L" makes it a "long", it is then autoboxed to a "Long", as per your homework.
        //https://en.wikipedia.org/wiki/List_of_cars_with_non-standard_door_designs
        this.driverDoor = new Door("Gullwing");
        this.shotgunDoor = new Door("Standard");
    }
}
