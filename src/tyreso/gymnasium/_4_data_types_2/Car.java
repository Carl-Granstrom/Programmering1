package tyreso.gymnasium._4_data_types_2;

/**
 * A simple Car-class to demonstrate a class made up of both primitive and reference types.
 *
 * @author Carl Granström
 */
class Car {
    //Primitive types and Strings
    String name;
    int numDoors;
    int numSeats;
    double lenghtCentimetres;
    double heightCentimetres;
    double lenghtHeightRatio;
    double speed;
    double maxSpeed;

    //Reference types, aka Objects
    Long numMetersDriven;   //Wrapper type for long primitive datatype
    Door driverDoor;
    Door shotgunDoor;
    Engine engine;

    Car(String name, int numDoors, int numSeats, double lenghtCentimetres, double heightCentimetres, Engine engine,
        double maxSpeed ){

        //Using the passed parameters to make the object with the variable values you want
        name += " skrot";
        this.name = name;
        this.numDoors = numDoors;
        this.numSeats = numSeats;
        this.lenghtCentimetres = lenghtCentimetres;
        this.heightCentimetres = heightCentimetres;
        this.engine = engine;
        this.lenghtHeightRatio = this.lenghtCentimetres / this.heightCentimetres;

        //Setting standard values for these variables
        this.numMetersDriven = 0L;  //the "L" makes it a "long", it is then autoboxed to a "Long", as per your homework.
        //https://en.wikipedia.org/wiki/List_of_cars_with_non-standard_door_designs
        this.driverDoor = new Door("Gullwing");
        this.shotgunDoor = new Door("Standard");
        this.speed = 0;
        this.maxSpeed = maxSpeed;
    }

    /**
     * This methods demonstrates one of the points with object oriented programming: the Car-object doesn't have to know
     * how its engine works. It just asks the engine to start itself.
     */
    public void start(){
        this.engine.ignite();
    }

    //TODO CODE TOGETHER!!!   CODE TOGETHER!!!   CODE TOGETHER!!!   CODE TOGETHER!!!   CODE TOGETHER!!!
    /**
     * It would seem we have no way to keep track of what speed the Car has, nor can we increase or decrease that speed.
     * Unless were happy just standing still with our engine running then that's fine, but we could do more.
     *
     * 1. Let's add variables for speed
     * 2. ...and methods for changing the speed
     */
    public void accelerate(double acceleration){
        if (speed < maxSpeed) {
            speed += acceleration;
        } else if (speed >= maxSpeed){

        }

    }

    public void decelerate(double deceleration){
        if (speed > 0 ){
            speed -= deceleration;
        }
    }
}
